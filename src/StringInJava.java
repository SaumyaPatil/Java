//import java.lang.String;
class StringInJava{
    public static void main(String[] args) {

        String a = "ankit"; //anything inside double quotes is a literal
        System.out.println(a);

        //JVM checks if "ankit" object exists inside string literal pool
        //If yes then it refers 'b' to same object and doesnt create different object
        String b = "ankit";
        System.out.println(b);

        //This does not work as 'b' refers to the same object.
        a.concat(" kumar");
        System.out.println(a);

        //Now 'a' reference variable refers to a new object 'ankit kumar'
        a = a.concat(" kumar");
        System.out.println(a);

        //String is final class
        String a = new String("ankit");
        System.out.println(a);

        String b = new String("ankit");
        System.out.println(b);

        a.concat(" kumar");
        System.out.println(a);

        a = a.concat(" kumar");
        System.out.println(a);

        //JVM mein java ki memory bach jaati hai and program execution fast ho jaata hai

        //New object named kumar will be created and 'a' refers to that
        a = "kumar";
        System.out.println(a);
    }
}