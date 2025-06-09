class ThisKeyword{

    int a;

    ThisKeyword(){
        this(200);
        System.out.println("This is default const");
    }

    ThisKeyword(int a){
        //Here, the JVM gets confused which one is instance which is local variable so it ignores the value 100 provided and prints the default value of int that is 0
        //a=a;

        //Now here, this refers to the current object and instance variable a is part of current object so...

        //this keyword calls the default constructor of the class 'ThisKeyword'
        //this();
        System.out.println(a);
        //this.a = a;
    }

    void show(){
        //'this' is mentioned either inside a method or a constructor
        //System.out.println(this);  //'this' refers to the current object
        System.out.println(a);
    }

    public static void main(String[] args) {

        //The object of the class is directly being initialised to the reference variable of the class.
        //When we create object, a ref unique id is generated and is referred by variable r as it is directly connected to its object.

        //This calls parameterised constructor
        //ThisKeyword r = new ThisKeyword(100);

        //This calls default constructor
        ThisKeyword r = new ThisKeyword();
        //System.out.println(r);  //unique id
        //r.show();
    }
}