import java.util.Scanner;

class MethodsTwo{

    //instance variable - variable declared outside any method in the class
    int n1, n2, add, sub, multi, div, rem;

    //You can take input anywhere inside the class if you create object here.
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }

    void process(){
        add=n1+n2;
        sub=n1-n2;
        multi=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }

    void disp(){
        System.out.println("Sum of two numbers " + add);
        System.out.println("Sub of two numbers " + sub);
        System.out.println("Multi of two numbers " + multi);
        System.out.println("Div of two numbers " + div);
        System.out.println("Rem of two numbers " + rem);
    }

    public static void main(String[] args) {

        MethodsTwo obj = new MethodsTwo();
        obj.input();
        obj.process();
        obj.disp();
    }
}