package com.ohgiraffers.youtube;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YoutubeManager {
    /*유튜브 목록이 저장되는 리스트*/
    private List<YoutubeDTO> youtubeList = new ArrayList();

    public void fileLoad(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("youtubeList.dat"))) {
            youtubeList = (List<YoutubeDTO>)ois.readObject();
        } catch (FileNotFoundException e) {
            youtubeList = new ArrayList<>();
        } catch (IOException e) {
            youtubeList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            youtubeList = new ArrayList<>();
        }
    }
    public void fileSave(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("youtubeList.dat"))) {
            oos.writeObject(youtubeList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /*영상 추가*/
    public void addList(YoutubeDTO youtube) {
        youtubeList.add(youtube);
    }
    /*영상 전체 조회*/
    public List<YoutubeDTO> selectList(){

        return youtubeList;
    }


    public void clearAll() {
        youtubeList.clear();
    }

    public void removetitle(String title) {

        for(int i =  0 ; i < youtubeList.size();i++){
            if((youtubeList.get(i).getTitle()).contains(title)){
                youtubeList.remove(i);
                i--;
            }
        }
    }

    public void removeYoutuber(String youtuber) {
        for(int i = 0; i<youtubeList.size();i++){
            if(youtubeList.get(i).getYoutuber().contains(youtuber)){
                youtubeList.remove(i);
                i--;
            }
        }
    }
}
