interface A{
    void Show();    //public + abstract
}

interface B{
    void Disp();   //public + abstract
}

//Theres no confusion to the compiler in multiple inheritance through interfaces.

class MultiInheritInterface implements A,B{

    public void Show(){
        System.out.println("Interface A");
    }

    public void Disp(){
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        MultiInheritInterface m = new MultiInheritInterface();
        m.Show();
        m.Disp();
    }
}