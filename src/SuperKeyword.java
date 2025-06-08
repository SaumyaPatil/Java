class A{
    int a=10;

    A(){
        System.out.println("This is constructor of class A.");
    }

    void show(){
        System.out.println("Hello I am class A!");
    }
}

class B extends A{
    int a=20;

    B(){
        //In case of default constructor, theres space for super keyword always reserved by default even if you dont mention it manually.

        //In case of parameterised constructor in super class, its important to mention super keyword along with parameters manually, else it throws error.
        //super();

        System.out.println("This is constructor of class B.");
    }

    void show(){
        //System.out.println(a);

        //Super keyword differentiates for compiler between member of super class and sub class if name of both variables or methods are same.
        //System.out.println(super.a); //10

        //Super keyword refers to the object of super class.
        //When the member name is same in super and sub class, you use super keyword if you want to access member of super class using sub's object.
        super.show();
        System.out.println("Hello I am class B!");
    }
}

class SuperKeyword{
    public static void main(String[] args) {
        B r = new B();
        r.show(); //calls method in class B
    }
}