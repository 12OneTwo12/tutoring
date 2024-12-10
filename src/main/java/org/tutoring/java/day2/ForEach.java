package org.tutoring.java.day2;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        int[] a = new int[7];

        // 반복문 시작해 임시 변수 i를 쓸거다. ( 반복문 안에서 ) i는 초기값 0이야.
        // i가 a.length(배열의 길이,크기)보다 작을때 실행한다.
        // 반복문이 끝날때마다 i의 숫자를 하나 늘린다.
        for(int i = 0; i < a.length; i++) {
            a[i] = 10;
        }

        // for each문 : a 배열의 첫번째 인덱스부터 끝까지 한번에 하나씩 e라는 변수에 넣어서 반복시킬거야
        for(int e : a) {
            System.out.println(e);
        }

        // 기본 Object X ;

        // 중첩반복문 -> 지양
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                for(int l = 0; l < a.length; l++) {
                    a[i] = 10;
                }
            }
        }
    }
}
