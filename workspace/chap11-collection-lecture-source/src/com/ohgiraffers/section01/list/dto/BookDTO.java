package com.ohgiraffers.section01.list.dto;

public class BookDTO {
    private int number;
    private String title;
    private String author;
    private int priece;

    public BookDTO(int number, String title, String author, int priece) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.priece = priece;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPriece() {
        return priece;
    }

    public void setPriece(int priece) {
        this.priece = priece;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", priece=" + priece +
                '}';
    }
}
