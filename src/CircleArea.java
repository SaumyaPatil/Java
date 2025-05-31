import java.util.Scanner;

class CircleArea{
    public static void main(String[] args) {

        final double PI = 3.14, area;

        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        area = PI*r*r;
        System.out.println(area);
    }
}
