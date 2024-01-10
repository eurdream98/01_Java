package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] st = new StudentDTO[10];
        boolean isTrue = true;
        int cnt = 0;
        while(true){

            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반 : ");
            int ban = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();
            st[cnt]= new StudentDTO(grade,ban,name,kor,eng,math);
            System.out.println("계속 추가할겁니까?(y/n)");
            String con = sc.nextLine();
            if(con.equals("n")){
                break;
            }
            cnt++;
        }
        for(int i = 0 ; i<cnt+1;i++){
            System.out.println(st[i].getInformation());

        }
    }
}
