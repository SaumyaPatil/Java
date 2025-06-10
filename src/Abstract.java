abstract class animal{

}

class Dog extends animal{

}

class Abstract{
    public static void main(String[] args) {

        //Animal class is abstract, cannot be instantiated.
        animal r = new animal();

        //any super class can store the object of sub class
        animal ref = new Dog();
    }
}