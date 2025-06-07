class Static{

    //These have nothing to do with object. So they are executed right after compilation.
    //We need to run them to see the result.
    static {
        System.out.println("This is static block!");
    }

    {
        System.out.println("This is instance block!");
    }

    Static(){
        System.out.println("This is constructor!");
    }

    public static void main(String[] args) {
        //The static block will be executed before the .class file is loaded into JVM memory.
        //If I remove this main method, code wont be executed as compiler needs the entry point.

        //You always need an object of the class to execute instance block.
        Static obj = new Static();
    }
}