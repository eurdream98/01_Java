package com.mafia;


import com.mafia.Citizen;
import com.mafia.Doctor;
import com.mafia.Player;
import com.mafia.Police;

import java.util.*;


// 게임 매니저 클래스
class Game {
    private List<Player> players;
    private Player[] mafiaPlayers;
    private Player[] citizenPlayers;
    private Player doctorPlayer;
    private Player policePlayer;
    private boolean gameOver;

    public Game() {
        players = new ArrayList<>();
        mafiaPlayers = new Player[2];
        citizenPlayers = new Player[4];
        gameOver = false;
    }

    public void initializePlayers() {
        Scanner scanner = new Scanner(System.in);

        // 마피아 생성
        System.out.println("마피아 2명을 등록합니다.");
        for (int i = 0; i < 2; i++) {
            System.out.print("마피아 " + (i + 1) + "의 이름을 입력하세요: ");
            String name = scanner.nextLine();
            Player player = new Mafia(name);
            players.add(player);
            mafiaPlayers[i] = player;
        }

        // 의사 생성
        System.out.print("의사의 이름을 입력하세요: ");
        String doctorName = scanner.nextLine();
        doctorPlayer = new Doctor(doctorName);
        players.add(doctorPlayer);

        // 경찰 생성
        System.out.print("경찰의 이름을 입력하세요: ");
        String policeName = scanner.nextLine();
        policePlayer = new Police(policeName);
        players.add(policePlayer);

        // 시민 생성
        System.out.println("시민 4명을 등록합니다.");
        for (int i = 0; i < 4; i++) {
            System.out.print("시민 " + (i + 1) + "의 이름을 입력하세요: ");
            String name = scanner.nextLine();
            Player player = new Citizen(name);
            players.add(player);
            citizenPlayers[i] = player;
        }
    }

    public void startGame() {
        System.out.println("게임을 시작합니다.");

        while (!gameOver) {
            // 게임 진행
            nightPhase();
            dayPhase();
        }
    }

    private void nightPhase() {
        System.out.println("=== 밤 시간 ===");
        System.out.println("마피아는 투표하여 희생할 플레이어를 선택합니다.");

        Player target = selectTarget(mafiaPlayers);
        if (target != null) {
            target.setAlive(false);
            System.out.println(target.getName() + " 플레이어가 마피아에 의해 희생되었습니다.");
        }

        System.out.println("의사는 생존할 플레이어를 선택하여 치료합니다.");
        Player savedPlayer = selectTarget(new Player[]{doctorPlayer});
        if (savedPlayer != null) {
            savedPlayer.setAlive(true);
            System.out.println(savedPlayer.getName() + " 플레이어가 의사에 의해 치료되었습니다.");
        }
    }

    private void dayPhase() {
        System.out.println("=== 낮 시간 ===");
        System.out.println("생존한 플레이어들이 서로 투표하여 마피아를 찾습니다.");

        Player votedPlayer = selectTarget(citizenPlayers);
        if (votedPlayer != null) {
            votedPlayer.setAlive(false);
            System.out.println(votedPlayer.getName() + " 플레이어가 투표로 인해 퇴장하였습니다.");

            if (isGameOver()) {
                gameOver = true;
                System.out.println("게임이 종료되었습니다.");
                System.out.println("마피아 승리!");
            }
        }
    }

    private Player selectTarget(Player[] players) {
        Random random = new Random();
        int index = random.nextInt(players.length);

        while (!players[index].isAlive()) {
            index = random.nextInt(players.length);
        }

        return players[index];
    }

    private boolean isGameOver() {
        int mafiaCount = 0;
        int citizenCount = 0;

        for (Player player : players) {
            if (player instanceof Mafia && player.isAlive()) {
                mafiaCount++;
            } else if (player instanceof Citizen && player.isAlive()) {
                citizenCount++;
            }
        }

        return mafiaCount >= citizenCount || mafiaCount == 0;
    }
}