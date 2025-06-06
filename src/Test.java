class ObjectsAndClass{

    int a=10;
    String b="ankush";

    void Show(){
        System.out.println(a + " " + b);
    }
}

class Test{

    public static void main(String[] args) {

        //This is a way to create object of a class
        ObjectsAndClass obj = new ObjectsAndClass();
        obj.Show();


        //Way 2
        ObjectsAndClass r;
        r = new ObjectsAndClass();
        r.Show();
    }
}