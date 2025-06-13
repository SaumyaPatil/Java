//We can use inheritance in interfaces too. If we want to use code of an interface in
//other interface, we extend interfaces.

interface Gill{
    void add();
}

interface Raj extends Gill{
    void sub();
}

class Ankit implements Raj{
    @Override
    public void add(){
        int a=10, b=20,c;
        c=a+b;
        System.out.println("Addition "+c);
    }

    @Override
    public void sub(){
        int a=20, b=10,c;
        c=a-b;
        System.out.println("Subtraction "+c);
    }
}

class ExtInt{
    public static void main(String[] args) {
        Raj r = new Ankit();
        r.add();
        r.sub();
    }
}