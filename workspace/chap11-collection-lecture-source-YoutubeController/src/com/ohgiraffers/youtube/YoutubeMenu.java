package com.ohgiraffers.youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryUsage;
import java.sql.SQLOutput;
import java.util.*;

public class YoutubeMenu {
    private YoutubeManager youtubeManager = new YoutubeManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() throws IOException {
        youtubeManager.fileLoad();
        mainMenu:
        while(true){
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 영상 추가");
            System.out.println("2. 영상 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 유튜버명으로 검색");
            System.out.println("5. 영상명으로 검색");
            System.out.println("6. 영상 정보 수정");
            System.out.println("7. 영상 아이디로 삭제");
            System.out.println("8. 영상 제목 전체 혹은 일부 입력하여 삭제");
            System.out.println("9. 유튜버 이름 전체 혹은 일부 입력하여 삭제");
            System.out.println("10. 영상 전체 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.println("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu){
                case 1:
                    addList();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    sortList();
                    break;
                case 4:
                    searchYoutuber();
                    break;
                case 5:
                    searchTitle();
                    break;
                case 6:
                    updateVideo();
                    break;
                case 7:
                    removeVideo();
                    break;
                case 8:
                    removetitleVideo();
                    break;
                case 9:
                    removetitleYoutuber();
                    break;
                case 10:
                    removeAllVideo();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    youtubeManager.fileSave();
                    break mainMenu;
                default :
                    System.out.println("잘못 선택 하셨습니다. 번호를 다시 입력해주세요.");
                    break;
            }
        }
    }

    private void removetitleYoutuber() throws IOException {
        System.out.println("==== 삭제할 유튜버 이름 전체 혹은 일부를 입력해주세요 ====");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Youtuber = br.readLine();
        youtubeManager.removeYoutuber(Youtuber);
    }

    private void removetitleVideo() throws IOException {
        System.out.println("==== 삭제할 영상 제목 전체 혹은 일부를 입력해주세요 ====");
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String title = br.readLine();
        youtubeManager.removetitle(title);
    }

    private void removeAllVideo() {
        System.out.println("==== 저장된 영상 전체 삭제 ====");
        youtubeManager.clearAll();
    }

    public void addList(){
        System.out.println("==== 영상 추가 ====");
        System.out.println("유튜버 입력 : ");
        String youtuber = sc.nextLine();
        System.out.println("영상 제목 입력 : ");
        String title = sc.nextLine();

        youtubeManager.addList(new YoutubeDTO(youtuber,title,new Date()));
    }

    public void selectList(){
        System.out.println("==== 영상 전체 조회 ====");
        List<YoutubeDTO> youtube=youtubeManager.selectList();
                if(youtube.isEmpty()){
            System.out.println("목록이 존재하지 않습니다.");
        }
        for(int i =0 ; i<youtube.size();i++) {
            System.out.println(youtube.get(i));

        }

    }

    public void sortList(){
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 유튜버명 오름차순 정렬");
        System.out.println("2. 동영상명 오름차순 정렬");
        System.out.println("3. 유튜브명 내림차순 정렬");
        System.out.println("4. 동영상명 내림차순 정렬");

        while(true){
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
                ascDesc(menu);

        }
    }

    public void ascDesc(int menu){
        System.out.println("==== 정렬하여 조회 ====");
        List<YoutubeDTO> youtube =  youtubeManager.selectList();
        if(youtube.isEmpty()){
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }
        List<YoutubeDTO> sortList = new ArrayList<>();
        sortList.addAll(youtube);
        if(menu==1){
            sortList.sort(new Comparator<YoutubeDTO>() {
                    @Override
                    public int compare(YoutubeDTO o1, YoutubeDTO o2) {
                        return o1.getYoutuber().compareTo(o2.getYoutuber());
                    }
                });
        }else if(menu==2){
            sortList.sort(new Comparator<YoutubeDTO>() {
                    @Override
                    public int compare(YoutubeDTO youtubeDTO1, YoutubeDTO youtubeDTO2) {
                        return youtubeDTO1.getTitle().compareTo(youtubeDTO2.getTitle());
                    }
                });
        }else if(menu==3){
            sortList.sort(new Comparator<YoutubeDTO>() {
                @Override
                public int compare(YoutubeDTO youtubeDTO1, YoutubeDTO youtubeDTO2) {
                    return youtubeDTO2.getYoutuber().compareTo(youtubeDTO1.getYoutuber());
                }
            });
        }else if(menu==4){
            sortList.sort(new Comparator<YoutubeDTO>() {
                @Override
                public int compare(YoutubeDTO youtubeDTO1, YoutubeDTO youtubeDTO2) {
                    return youtubeDTO2.getTitle().compareTo(youtubeDTO1.getTitle());
                }
            });

        }
        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }
    }

    public void searchYoutuber(){
        List<YoutubeDTO> youtube = youtubeManager.selectList();
        System.out.print("유튜버명을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int cnt =0;
        for(int i = 0 ; i<youtube.size();i++){
            if((youtube.get(i).getYoutuber()).contains(name)){
                System.out.println(youtube.get(i));
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("유튜버가 존재하지 않습니다.");
        }
    }

    public void searchTitle(){
        List<YoutubeDTO> youtube = youtubeManager.selectList();
        System.out.print("영상 제목을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int cnt=0;
        for(int i = 0 ; i<youtube.size();i++){
            if((youtube.get(i).getTitle()).contains(name)){
                System.out.println(youtube.get(i));
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("영상이 존재하지 않습니다.");
        }
    }

    public void updateVideo(){
        Scanner sc = new Scanner(System.in);
        List<YoutubeDTO> youtube = youtubeManager.selectList();
        System.out.print("수정할 영상의 id를 입력해주세요 : ");
        int id = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i<youtube.size();i++){
           if(id==youtube.get(i).getId()){
               System.out.print("수정할 영상의 유튜버 : ");
               String youtuber = sc.nextLine();
               System.out.print("수정할 영상의 제목 : ");
               String title = sc.nextLine();
               youtube.get(i).setYoutuber(youtuber);
               youtube.get(i).setTitle(title);
               System.out.println("수정이 완료되었습니다!");
               System.out.println(youtube.get(i));
           }else{
               System.out.println("해당하는 id의 정보가 없습니다.");
           }

        }
        System.out.println();

    }

    public void removeVideo(){
        Scanner sc = new Scanner(System.in);
        List<YoutubeDTO> youtube = youtubeManager.selectList();
        System.out.print("삭제할 영상의 아이디를 입력해주세요 : ");
        int num = sc.nextInt();
        int cnt = 0;
        sc.nextLine();
        for(int i = 0;i<youtube.size();i++){
            if(youtube.get(i).getId()==num){
                youtube.remove(i);
                cnt++;
                System.out.println(youtube);
            }
        }
        if(cnt==0){
            System.out.println("아이디가 존재하지 않습니다.");
        }
    }

}
