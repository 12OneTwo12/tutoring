package org.tutoring.java.day1;

public class Car {

    public int w; // 바퀴
    public int e; // 엑셀
    public int b; // 브레이크

    //생성자는 객체를 인스턴스로 만들 수 있는 방법을 정의하는 것.
    public Car(int w, int e, int b) { //매개변수, 파라미터
        this.w = w;
        this.e = e;
        this.b = b;
    }

    public void go(){
        System.out.println("Car go!!! w=" + w + " e=" + e + " b=" + b);
    }
}
