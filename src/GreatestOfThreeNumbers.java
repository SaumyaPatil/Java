import java.util.Scanner;

class GreatestOfThreeNumbers{
    public static void main(String[] args) {

        //Finding greatest number among three numbers
        int a,b,c;
        System.out.println("Enter the values of a, b and c ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //condition ka baat aiye toh if else use kro
        if (a>b){
            if (a>c) System.out.println("a is the greatest of all");
            else System.out.println("c is the greatest of all");
        } else {
            if (b>c) System.out.println("b is the greatest of all");
            else System.out.println("c is the greatest of all");
        }
    }
}
