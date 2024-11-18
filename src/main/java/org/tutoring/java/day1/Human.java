package org.tutoring.java.day1;

public class Human {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 메소드는 일련의 코드의 집합체
     * 호출되면 안에있는 코드가 실행된다.
     */
    public void walk(){
        System.out.println("Human 걸었음!");
    }

    /*
     * void : 공허한
     * Return이 없음.
     *
     * 요청과 응답으로 이루어져있다.
     * 메소드도 요청과 응답으로 이루어져 있음.
     *
     * 요청은 메소드 이름 + 파라미터
     * 응답은 return a + b;
     *
     * void는 응답이 없다는 명세
     */
    public int add(int a, int b){ // 하나의 명세. 명세를 지키지 않으면 실행도 안됨. (컴파일 에러가 발생)

        // 여기 코드가 몇만줄이 넘어가더라도.

        return a + b;
    }
}
