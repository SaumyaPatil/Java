import java.util.Scanner;

class While{
    public static void main(String[] args) {

        int n;
        System.out.println("Enter value for condition ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>=0){
            //This loop may run infinite times
            System.out.println("Learn coding ");
        }

        //Purpose 2
        //Executing repeated task using while loop

        System.out.println("Learn coding");
        System.out.println("Learn coding");
        System.out.println("Learn coding");
        System.out.println("Learn coding");
        System.out.println("Learn coding");
        System.out.println("Learn coding");
        System.out.println("Learn coding");

        int k=1;
        while(k<=10){
            System.out.println("Learn coding");
            ++n;
        }

    }
}

