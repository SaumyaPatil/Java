interface A{

    //Static methods can be directly accessed through interfaces.
    public static void Show(){
        System.out.println("Can't override interface static method.");
    }

    //You can write main methods inside interface as main method is static in java
    public static void main(String[] args) {
        System.out.println("Learn Coding!");
    }

    //There is abstract method in an interface so we need to implement the interface in the class
    //and define method there.

    //When we have no such abstract method in interface, then we need not have implementing class.
    void disp();
}

class Demo implements A{

    //Static methods cannot be annotated with @Override
    //@Override
    public static void Show(){
        System.out.println("Error");
    }

    void disp(){
        System.out.println("There is this method here!!!");
    }
}

class InterfaceStaticMethods{
    public static void main(String[] args) {
        A.Show();
        Demo d = new Demo();
        d.Show();
    }
}