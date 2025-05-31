import java.util.Scanner;

class SumOfDigits{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum=0;
        while(n>0){
            int k = n%10;
            sum += k;
            //if (n%10 == n)break;
            n = n/10;
        }
        System.out.println(sum);
    }
}

//Output of java programs
//What does the expression double b=10/0; return?      --------> infinity
//Integer data type ke alawa agr aap kisi float double vgrea ko 0 se divide kroge toh milega, na ki exception
//Portability and securing of java  --------> byte code
//Which package contains system class ------> lang package
//Java is case sensitive
//Java was publicly released in    ------------> 27th may 1995
//Advantages ----> simple, secure, portable
//output of the code is 1
//Default data type of decimal value in java ------> double
//Which one is a valid declaration of boolean data type ----------> boolean b=false
//Scanner is a pre-defined class
