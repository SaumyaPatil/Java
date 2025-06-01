import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean flag = true;
        for (int i=2; i<n; i++){
            if (n%i == 0){
                System.out.println("It is not a prime number.");
                flag=false;
                break;
            }
        }
        if(flag == true)System.out.println("It is prime number.");
    }
}
