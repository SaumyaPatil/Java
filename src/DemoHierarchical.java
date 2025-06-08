//In hierarchial inheritance theres common source code written inside super class.

class A{
    void input(){
        System.out.println("Enter your name: ");
    }
}

class HierarchialOne extends A{
    void Show(){
        System.out.println("My name is Saumya.");
    }

    //Always create object of sub class as it has property of its own along with super class.

}

class HierarchialTwo extends A{
    void Display(){
        System.out.println("My name is Saumya here too.");
    }
}

class DemoHierarchical{
    public static void main(String[] args) {
        HierarchialOne r = new HierarchialOne();
        HierarchialTwo r2 = new HierarchialTwo();

        r.input();
        r.Show();

        r2.input();
        r2.Display();
    }
}