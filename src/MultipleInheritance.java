class A{
    void show(){
        System.out.println("This is class A");
    }
}

class B{
    void show(){
        System.out.println("This is class B");
    }
}

class MultipleInheritance extends A,B{
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.show();
        //Compiler gets confused who's show method is getting called!
        //We can sought multiple inheritance through interface
    }
}