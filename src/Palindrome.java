import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        String str = Integer.toString(n);

        int i=0;
        while(i<str.length()/2){
            if(str.charAt(0) != str.charAt(str.length()-1-i)){
                System.out.println("Number is not a palindrome.");
                break;
            }
            i++;
        }
        System.out.println("The number is a palindrome.");


        //You can reverse the number first and then check if its palindrome or not.
    }
}
