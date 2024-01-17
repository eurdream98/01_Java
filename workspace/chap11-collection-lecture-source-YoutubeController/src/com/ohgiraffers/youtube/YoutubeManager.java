package com.ohgiraffers.youtube;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YoutubeManager {
    /*유튜브 목록이 저장되는 리스트*/
    List<YoutubeDTO> youtubeList = new ArrayList();


    /*영상 추가*/
    public void addList(YoutubeDTO youtubeDTO) {
        youtubeList.add(youtubeDTO);
    }
    /*영상 전체 조회*/
    public List<YoutubeDTO> selectList(){
        if(youtubeList.isEmpty()){
            System.out.println("목록이 존재하지 않습니다.");
        }
        for(int i =0 ; i<youtubeList.size();i++) {
            System.out.println(youtubeList.get(i));

        }
        return youtubeList;
    }
    /*유튜버 조회*/

    /*제목 조회*/
    /*영상 제목 수정*/
    /*영상 삭제*/



}
