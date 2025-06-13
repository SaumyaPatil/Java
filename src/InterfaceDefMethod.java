interface A{
    void a1();      //public + abstract
    void a2();      //public + abstract

    //Without affecting the implementing classes, you can add method in interface, define it and also over-ride it.
    default void a3(){
        System.out.println("May or may not override in implementing classes.");
    }
}

class B implements A{
    public void a1(){
        System.out.println("Class B a1()");
    }

    public void a2(){
        System.out.println("Class B a2()");
    }

    //Access modifier should be same or greater than that in interface.
    public void a3(){
        System.out.println("Override in implementing class B.");
    }
}

class C implements A{
    public void a1(){
        System.out.println("Class C a1()");
    }

    public void a2(){
        System.out.println("Class C a2()");
    }
}

class D implements A{
    public void a1(){
        System.out.println("Class D a1()");
    }

    public void a2(){
        System.out.println("Class D a2()");
    }
}

class InterfaceDefMethod{
    B b = new B();
    b.a1();
    b.a2();
    b.a3();

    C c = new C();
    c.a1();
    c.a2();
    c.a3();

    D d = new D();
    d.a1();
    d.a2();
    d.a3();
}