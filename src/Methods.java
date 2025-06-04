import jdk.internal.org.jline.utils.Display;

class Methods{
    //Methods help maintain redability in code as different tasks are carried by different methods
    //Decreases lines of code

    public static void Add(){
        int a=10, b=20;
        System.out.println("Sum " + (a+b));
    }

    void Display(){      //method name should be relevant to the kind of work its doing
        System.out.print("Learn Coding");
    }

    public static void main(String[] args) {
        Methods r = new Methods();
        r.Display();
//        Display(); //You are calling a non-static method display in a static method main, you cant do that.
        Methods.Add();
        Methods.Add();       //The method can be called multiple times
        Methods.Add();
        Methods.Add();
    }
}
