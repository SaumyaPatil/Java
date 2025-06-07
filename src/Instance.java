
class C{
    int a,b;

    void Show(){
        a=50;
        b=60;
        System.out.println(a+" "+b);
    }

    //This will execute without relaying on object.
    static void ShowStat(){
        System.out.println("Learn Coding");
    }

    //This constructor is executed just after the execution of instance block when you create an object.
    C(){
        a=20;
        b=40;
        System.out.println(a+" "+b);
    }

    {
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
}

class Instance{
    public static void main(String[] args) {

        //Static members are executed as soon as we load .class file in JVM.
        //We can control and execute as per our wish.
        C.ShowStat();

        C r = new C();
        r.Show();
    }
}