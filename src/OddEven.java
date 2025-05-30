import java.util.Scanner;

class OddEven{
    public static void main(String[] args) {

        //Check if the number is even or odd
        int n;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

    }
}
