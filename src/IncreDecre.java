class IncreDecre{
    public static void main(String[] args) {
        int a=10;   //unary operator
        System.out.println(a);

        System.out.println("PrePost increment ");
        System.out.println(a++); //10  (11)
        System.out.println(++a); //12


        System.out.println("PrePost decrement ");
        System.out.println(a--); //12  (11)
        System.out.println(--a); //10


    }
}