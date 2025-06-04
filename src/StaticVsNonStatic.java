class StaticVsNonStatic{

    int a=10;   //instance variable
    static int b=20;     //static instance variable

    //static method is declared using static keyword
    static void show(){
        System.out.println(b);
    }

    //non-static method    (no keyword required)
    void disp(){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        StaticVsNonStatic r = new StaticVsNonStatic();

        //Static methods can be directly accessed using class
        //Static methods can only access static variables
        r.show();

        //Non-static methods are called using object of the class
        //These methods can access both static and non-static variables
        r.disp();
    }
}