class InstanceVsStatic{

    int a=10;
    static int b=30;

    InstanceVsStatic(){
        System.out.println("Default constructor!");
    }

    {
        //Instance block is called as soon as we create an object, just before constructor / default constructor.
        //Accesses both static and non static variables
        System.out.println(a+" "+b);
        System.out.println("This is instance block!");
    }

    //It has nothing to do with object. It is executed just before execution.
    //Requires static keyword.
    static {

        //Static block can access just static variables.
        System.out.println(b);
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
        InstanceVsStatic obj = new InstanceVsStatic();
    }

}