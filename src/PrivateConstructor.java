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
        System.out.println("Saumya");
    }

    public static void main(String[] args) {
        //You can access constructor of this class through object, in the class only since its private.
        PrivateConstructor r = new PrivateConstructor();
    }
}