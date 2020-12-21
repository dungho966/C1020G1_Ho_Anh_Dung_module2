package bai15_exception.baitap;

import java.util.Scanner;

public class Triangle {
    private int a ;
    private int b ;
    private int c;

    public Triangle(){

    }


    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if ( a<= 0 || b<=0 || c<=0){
            throw new IllegalTriangleException("canh nho hon 0 , khong thoa man");
        } else if (a + b < c || a + c < b || b + c < a){
           throw new IllegalTriangleException("ko thoa man dieu kien");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
