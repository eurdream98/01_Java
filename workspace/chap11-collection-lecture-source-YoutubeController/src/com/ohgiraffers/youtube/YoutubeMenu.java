package com.ohgiraffers.youtube;

import java.util.*;

public class YoutubeMenu {
    private YoutubeManager youtubeManager = new YoutubeManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        mainMenu:
        while(true){
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 영상 추가");
            System.out.println("2. 영상 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 유튜버명으로 검색");
            System.out.println("5. 영상명으로 검색");
            System.out.println("6. 영상 정보 수정");
            System.out.println("7. 영상 삭제");
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
//                case 4:
//                    searchYoutuber();
//                    break;
//                case 5:
//                    searchTitle();
//                    break;
//                case 6:
//                    updateVideo();
//                    break;
//                case 7:
//                    removeVideo();
//                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default :
                    System.out.println("잘못 선택 하셨습니다. 번호를 다시 입력해주세요.");
                    break;
            }
        }
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
        youtubeManager.selectList();
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
            if(menu>=1&&menu<=4) {
                ascDesc(menu);
                break;
            }
            System.out.println("다시 입력해주세요.");
        }
    }

    public void ascDesc(int menu){
        System.out.println("==== 정렬하여 출력 ====");
        List<YoutubeDTO> youtube =  youtubeManager.selectList();
        List temp = new ArrayList();
        temp.addAll(youtube);
        System.out.println(temp);
        if(menu==1){
                temp.sort(new Comparator<YoutubeDTO>() {
                    @Override
                    public int compare(YoutubeDTO youtubeDTO1, YoutubeDTO youtubeDTO2) {
                        return youtubeDTO1.getYoutuber().compareTo(youtubeDTO2.getYoutuber());
                    }
                });
        }else if(menu==2){
                temp.sort(new Comparator)
        }else if(menu==3){

        }else if(menu==4){

        }else{
            System.out.println("다시 입력해주세요.");
            ascDesc(menu);
        }
    }

}
