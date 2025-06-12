import java.util.Scanner;

interface client{
    void input();     //public + abstract
    void output();    //public + abstract
}

class Interface implements client{
    String name;
    double sal;
    //It provides default access modifier by default which is weaker than public modifier
    //You need to have same access modifier present in interface which is 'public'.
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = r.nextLine();

        System.out.println("Enter Salary: ");
        sal = r.nextDouble();
    }

    public void output(){
        System.out.println(name+" "+sal);
    }

    //Now developer will provide a setup file to the client and not the source code.
    //Client will install the source code in its system where it can only see the output.
    public static void main(String[] args) {

        //Object reference interface ka banaana hai aur object class ka bnega as total control
        // developer ke paas hai!
        client c = new Raju();
        c.input();
        c.output();

    }
}