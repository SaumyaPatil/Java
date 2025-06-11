//abstract class Programming{
//    //We have incomplete information
//    public abstract void Developer();
//    public abstract void Rank();
//}
//
////It is compulsory for the sub classes to override the method
//class HTML extends Programming{
//
//    //Use this keyword only when method is over-ridden
//    @Override
//    public void Developer(){
//        System.out.println("Tim Berners Lee");
//    }
//
//    //If you don't override both the methods, you will have to make the class abstract
//    @Override
//    public void Rank(){
//        System.out.println("3rd");
//    }
//}
//
////We have made it abstract class as it is not over riding method Rank!!
//abstract class Java extends Programming{
//    //Use this keyword only when method is over-ridden
//    @Override
//    public void Developer(){
//        System.out.println("Games Gosling");
//    }
//
//    //Here we have not overridden the second method so it will throw error
//}
//
//class AbstractMethod{
//    public static void main(String[] args) {
//        HTML h = new HTML();
//        h.Developer();
//
//        //Here you cannot create object of class as it is abstract class
////        Java j = new Java();
////        j.Developer();
//
//        //You can create object reference of abstract class
//        Programming h = new HTML();
//        h.Developer();
//
////        Programming j = new Java();
////        j.Developer();
//    }
//}



//We can do it this way
abstract class Programming{
    //We have incomplete information
    public abstract void Developer();
    public abstract void Rank();
}

//It is compulsory for the sub classes to override the method
abstract class HTML extends Programming{
    //Use this keyword only when method is over-ridden
    @Override
    public void Developer(){
        System.out.println("Tim Berners Lee");
    }
}

//Now the total control is in the hands of Java class, we can create object of java class and access both the methods!
class Java extends Programming{
    @Override
    public void Rank(){
        System.out.println("3rd");
    }
}

class AbstractMethod{
    public static void main(String[] args) {
        Programming h = new Java();
        h.Developer();
        h.Rank();
    }
}