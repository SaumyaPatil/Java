import java.io.Console;

class ConsoleClass{
    public static void main(String[] args) {

        //For security purpose you can create project this way as password is not visible.
        String str;
        char ch[];
        Console obj = System.console();
        System.out.print("Enter username: ");
        str = obj.readLine();
        System.out.print("Enter password: ");
        ch = obj.readPassword();

        //ch variable mein ek ek char ko leke vapas string me convert kr deiga
        String a = String.valueOf(ch);
        System.out.println("Username: " + str);
        System.out.println("Password: " + a);
    }
}