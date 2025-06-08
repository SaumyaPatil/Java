//Main purpose of inheritance is to re-use code in other classes.

class A{    //super class
    int a,b,c;
    void add(){
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }

    void sub(){
        a=200; b=300;
        c=a-b;
        System.out.println("Sub of two numbers: "+c);
    }
}

class B extends A{  //sub class 1
    void multi(){
        a=10; b=20;
        c=a*b;
        System.out.println("Multi of two numbers: "+c);
    }

    void div(){
        a=30; b=40;
        c=a/b;
        System.out.println("Div of two numbers: "+c);
    }
}

class C extends B{ //sub class 2
    void rem(){
        a=10; b=2;
        c=a%b;
        System.out.println("Remainder of two numbers: "+c);
    }
}

class MultiLevelInheritance{
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}