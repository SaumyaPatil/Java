class Test{

    int a = 10;          //instance variable (variable declared inside a class body but outside of any method
    static int b = 20;   //static variable


    public static void main(String[] args) {
        int c = 40;    //local variable (variable inside a method)
        final int D = 50;   //final variable (the value cannot be changed)

        Test t = new Test();   //object creation (We cannot access the instance variable without creating object. t is the reference variable inside of which object reference is stored.)
        System.out.println(t.a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(D);   //final variable ko represent krneka treeka hai ye capital letter se

    }
}

//Comments are used to make programme more readable for other programmers so that the code is well defined.