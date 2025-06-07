class ConstructorOverloading{

    int a; double b; String c;

    //There are these four constructors in our class, their natures are different.
    //Parameter list should always be different. Either change number of parameters or keep the type of parameters different in each constructor of a class.

    //Private constructor is also a type of default constructor. At the time of creation of object
    //both should be called. So the compiler got confused.

    private ConstructorOverloading(){
        a=100; b=24.55; c="Ankit";
    }

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
