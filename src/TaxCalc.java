//input sal<=100000  -> no tax
//input sal>100000 b/w sal<=100000 ---> 10% tax
//input sal>100000 ---> 20% tax

import java.util.Scanner;

class TaxCalc{
    public static void main(String[] args) {

        int sal;
        Scanner sc = new Scanner(System.in);

        sal = sc.nextInt();
        double tax=0;
        if (sal<=10000) System.out.println(sal + " No Tax");
        else if (sal>10000 && sal<=100000){
            tax = 0.10 * sal;
            System.out.println(sal + " " + tax);
        }else {
            tax = 0.20 * sal;
            System.out.println(sal + " " + tax);
        }
    }
}
