class shape{
    void draw(){
        System.out.println("Cant say shape type!");
    }
}

//Without inheritance, we cannot perform method overriding!
class square extends shape{

    //When method is not overridden, it will call method of super class even if you create object of sub class.
    @Override     //this method is over ridden
    void draw(){
        super.draw();        //calls method of super class
        System.out.println("Square shape");
    }
}

//Main advantange of method overriding is that even after having exactly same methods, it shows its own different behaviour

class MethodOverriding{
    public static void main(String[] args) {
        //square ref = new square();
        shape ref = new square();
        ref.draw();
    }
}