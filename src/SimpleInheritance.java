
class Student{      //super
    protected int roll, marks;
    String name;

    //input method is a private member of class Student and is accessible only inside Student class.
    //private members cannot be inherited

    //protected can be inherited. Protected is for inheritance purpose itself.
    protected void input(){
        System.out.println("Enter roll name and marks: ");
    }
}

class SimpleInheritance extends Student{  //sub class

    void display(){
        roll=1;
        name="Saumya";
        marks=29;
        System.out.println(roll+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        SimpleInheritance r = new SimpleInheritance();
        r.input();
        r.display();
    }
}