import java.util.Scanner;

class AreaOfSquare{
    public static void main(String[] args) {
        int side;
        Scanner sc = new Scanner(System.in);

        side = sc.nextInt();
        int area = side*side;

        System.out.println("Area of square is "+area);
    }
}
