package org.tutoring.java.day3;

public class Car {

    private int w; // 바퀴
    private int e; // 엑셀
    private int b; // 브레이크

    //생성자는 객체를 인스턴스로 만들 수 있는 방법을 정의하는 것.
    public Car(int w, int e, int b) { //매개변수, 파라미터
        this.w = w;
        this.e = e;
        this.b = b;
    }

    public void go(){
        System.out.println("Car go!!! w=" + w + " e=" + e + " b=" + b);
    }

    public int getW() {
        return w;
    }

    public int getE() {
        return e;
    }

    public int getB() {
        return b;
    }
}
