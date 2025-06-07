class Default{

    int a;
    String b;
    boolean c;

    //When compiler adds default constructor on its own, compiler by default initialises
    //default values of int (0), string (null) and boolean (false)
    //These default values are of no use to us, so we create our own default constructor.

    Default(){
        //default constructor
        a=100;
        b="ankit";
        c=true;
    }

    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}

class Parameterised{

    int x, y;
    Parameterised(int a, int b){
        x=a;
        y=b;
    }

    //You can create more than one parametrised constructors in a class.
    //But you will have to provide different types of parameters otherwise, overwriting problem will arise.
    //Variables passed as parameters are of primitive type only.
    Parameterised(int a, String b){
        System.out.println(a+ " " +b);
    }

    void Show(){
        System.out.println(x+" "+y);
    }
}

class CopyConstructor{

    int a;
    String b;
    CopyConstructor(int x, String y){
        a=x;
        b=y;
        System.out.println(a+" "+b);
    }

    CopyConstructor(CopyConstructor ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

class PrivateConstructor{
    int a;
    double b;
    String c;

    private PrivateConstructor(){
        a=10;
        b=20.3;
        c="Saumya";
        System.out.println(a+" "+b+" "+c);
    }

    static void Show(){
        //You can create static method and define logic here. You will be able to call it without help of object of this class.
        System.out.println("Saumya");
    }

    public static void main(String[] args) {
        PrivateConstructor r = new PrivateConstructor();
    }
}

class ConstructorOverloading{

    int a; double b; String c;

    //There are these four constructors in our class, their natures are different.
    //Parameter list should always be different. Either change number of parameters or keep the type of parameters different in each constructor of a class.
    ConstructorOverloading(){
        a=100; b=24.55; c="Ankit";
    }

    ConstructorOverloading(int x){
        a=x;

    }

    ConstructorOverloading(double y, String z){
        b=y;
        c=z;
    }

    public static void main(String[] args) {
        ConstructorOverloading r = new ConstructorOverloading();
        ConstructorOverloading r2 = new ConstructorOverloading(10);
        ConstructorOverloading r3 = new ConstructorOverloading(23.4, "Saumya");

        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}

class B{
    public static void main(String[] args) {
        //init object and init values in instance variables
//        Default r = new Default();
//        r.Disp();
//
//        Parameterised r2 = new Parameterised(100, 200);
//        r2.Show();
//
//        Parameterised r3 = new Parameterised(100, "Saumya");
//        r3.Show();

//        CopyConstructor r4 = new CopyConstructor(10, "Learn Coding");
//        CopyConstructor r5 = new CopyConstructor(r4);

        //Since it has private constructor, you can access it only in the class and not here or any other class.
        //PrivateConstructor r6 = new PrivateConstructor();
        PrivateConstructor.Show();


        ConstructorOverloading r = new ConstructorOverloading();
        ConstructorOverloading r2 = new ConstructorOverloading(10);
        ConstructorOverloading r3 = new ConstructorOverloading(23.4, "Saumya");

        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}