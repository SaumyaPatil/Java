class DoWhile{
    public static void main(String[] args) {
//        int n=1;
//        do{
//            System.out.println(n);
//            ++n;
//        }while(n<=10);


        //If you dont use do-while loop, you will have to have 10 different variables to print natural numbers from 1 to 10
        int n=1;
        System.out.println(n++);   //1 2
        System.out.println(n);     //2 2
        System.out.println(++n);   //3 3
        System.out.println(n);     //3
    }
}
