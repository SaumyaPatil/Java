abstract class animal{

    //We can also create some normal methods in the class and implement it
    animal(){
        System.out.println("All animals!");
    }

    //We cannot implement this function here as we dont know what animal is being talked about!
    //Every animal has different sound
    public abstract void sound();
}

class Dog extends animal{

    Dog(){
        //This constructor calls the constructor of super class!
        super();
    }
    public void sound(){
        System.out.println("Dog is barking!");
    }
}

class Lion extends animal{

    Lion(){
        //This constructor calls constructor of super class!
        super();
    }

    public void sound(){
        System.out.println("Lion is roaring!");
    }
}

class AbstractProgram{
    //Need of abstract class instead of having normal class
    Dog d = new Dog();
    Lion l = new Lion();
    d.sound();
    l.sound();
}