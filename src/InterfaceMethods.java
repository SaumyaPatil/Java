interface Client{

    //100% requirement is of client
    void webDesign();           //public + abstract
    void webDevelopment();      //public + abstract
}

abstract class RajTech implements Client{
    @Override
    //It will design as per client's requirement
    //The access modifier of this method is default which is smaller than 'public'
    public void webDesign(){
        System.out.println("Green, top menu, three dot button");
    }
}

abstract class RahulTech extends RajTech{
    @Override
    public void webDevelop(){
        System.out.println("HTML, CSS, JAVASCRIPT");
    }
}

class InterfaceMethods{
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.webDesign();
        r.webDevelop();
    }
}