
//input n1, n2  ------> (Select operation) result

import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        int n1, n2, ch, cal;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();   //10
        n2 = sc.nextInt();   //20

        System.out.println("Select operation ");
        ch = sc.nextInt();

        if (ch==1){
            cal = n1+n2;
            System.out.println("ADDITION " + cal);
        } else if (ch==2) {
            cal = n1-n2;
            System.out.println("SUBTRACTION " + cal);
        } else if (ch==3) {
            cal = n1*n2;
            System.out.println("MULTIPLICATION " + cal);
        } else if (ch==4) {
            cal = n1/n2;
            System.out.println("DIVISION " + cal);
        }else {
            cal = n1%n2;
            System.out.println("REMAINDER " + cal);
        }
    }
}
