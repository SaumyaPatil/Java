class Variables{

    static int b=20; //Static
    int c = 10;     //Instance
    public static void main(String[] args) {

        int a=10;      //Local
        A ref=new A();
        System.out.println(a);
        System.out.println(A.b);
        System.out.println(ref.c);

    }
}

