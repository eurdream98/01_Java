package com.ohgiraffers.youtube;

import java.io.Serializable;
import java.util.Date;

public class YoutubeDTO implements Serializable {
    private static int nextId = 1;
    private int id;
    private String youtuber;
    private String title;
    private Date uploadDate;

    public YoutubeDTO(String youtuber, String title, Date uploadDate) {
        this.id = nextId++;
        this.youtuber = youtuber;
        this.title = title;
        this.uploadDate = uploadDate;
    }

    public YoutubeDTO(int id, String youtuber, String title, Date uploadDate) {
        this.id = id;
        this.youtuber = youtuber;
        this.title = title;
        this.uploadDate = uploadDate;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        YoutubeDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutuber() {
        return youtuber;
    }

    public void setYoutuber(String youtuber) {
        this.youtuber = youtuber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "YoutubeDTO{" +
                "id=" + id +
                ", youtuber='" + youtuber + '\'' +
                ", title='" + title + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }
}
