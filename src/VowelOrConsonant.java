import java.util.Scanner;

class VowelOrConsonant{
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character ");

        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Its a vowel");
        } else if ((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z')){
            System.out.println("Its a consonant");
        } else {
            System.out.println("Invalid character");
        }
    }
}
