import java.util.Scanner;

class PowerOfANumber{
    public static void main(String[] args) {
        int input, power;
        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();
        power = sc.nextInt();

        long ans=1;
        for (int i=1; i<=power; i++){
            ans *= input;
        }
        System.out.println("Power " + ans);
    }
}
