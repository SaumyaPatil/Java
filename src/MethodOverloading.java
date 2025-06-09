class MethodOverloading{

    //This is a way to achieve compile time polymorphism
    //Method overloading can be achieved with inheritance and without it also just like we have done it here.

    //We can have return type for method.
    int add(){
        int a=10, b=20, c=a+b;
        return c;
    }

    void add(){
        int a=10, b=20, c=a+b;
        System.out.println(c);
    }

    void add(int x, int y){
        int c=x+y;
        System.out.println(c);
    }

    void add(int x, double y){
        double c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        MethodOverloading ref = new MethodOverloading();

        //Compiler knows at compile time itself, here which method is called by the behaviour of the method
        int add = ref.add(); //here, the return type of method is 'int'
        System.out.println(add);
        ref.add(100, 200);
        ref.add(50, 45.32);
        ref.add();  //here, return type of method is 'void'
    }
}