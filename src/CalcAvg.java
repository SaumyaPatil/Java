import java.util.Scanner;

class CalcAvg{
    public static void main(String[] args) {

        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("Total marks " + sum);

        //average hamaara fractional part mein bhi aa sakta hai
        //floating point mein value aa sakta hai
        double avg = sum/5.0;
        System.out.println("Average marks " + avg);
    }
}
