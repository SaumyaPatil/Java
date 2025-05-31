
//input a b c
//1. find semiperimeter
//2. area of triangle


import java.util.Scanner;

class AreaOfTriangle{
    public static void main(String[] args) {
        int a,b,c,sp;
        Scanner sc = new Scanner(System.in);
        double area;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        sp = (a+b+c)/2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        //sqrt is a static method in math class of java
        //Math class is inside lang package in java which is a default package
        System.out.println("Area of triangle "+area);
    }
}
