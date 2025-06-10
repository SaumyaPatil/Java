class Demo{
    //Every class in java is an example of encapsulation

    //Encapsulation is a combination of data hiding and abstraction. So every variable in a class is private.
    private int value;   //data hiding

    //We have provided abstraction through method using which we can access and update value outside the class.
    public void setValue(int x){
        value = x;
    }

    public int getValue(){
        return value;
    }
}

class Encapsulation{
    public static void main(String[] args) {
        Demo r = new Demo();
        //r.value = 100; //Cannot access value outside class Demo as it is a private variable
        //System.out.println(r.value);   //Cannot access value outside class Demo as it is a private variable

        r.setValue(100);
        System.out.println(r.getValue());
    }
}

//Suppose you wanna create login system, you provide credentials in the field. You cannot see the coding of that field.
//Now you will be logged in if you are valid, that coding is represented by getValue method.
