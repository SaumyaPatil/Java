class Variables{

    static int b=20; //Static  -> iska single memory banta hai aur iska lifetime poore program tak hota hai
    //ye apni older value ko hold karke rakhta hai!
    int c = 10;     //Instance

    void fun(){
        int c=20;
        System.out.println(b+" "+c);
        ++b;
        ++c;
    }

    public static void main(String[] args) {

        int a=10;      //Local
        Variables ref=new Variables();
        System.out.println(a);
        System.out.println(Variables.b);
        System.out.println(ref.c);
        //Single copy of static variables while multiple copies of local variables
        //Life span of static variables is till the program is completely executed
        ref.fun(); //20 20
        ref.fun(); //21 20

    }
}

