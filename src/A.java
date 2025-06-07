class Constructor{

    int a;
    String name;

    //Initialises value in instance variable. Instance variable is part of object.
    Constructor(){
        a=0;
        name=null;
    }

    void Show(){
        System.out.println(a+" "+name);
    }

    public static void main(String[] args) {

    }
}

class A{
    public static void main(String[] args) {
        Constructor ref = new Constructor();
        ref.Show();
    }
}