class Ternary{
    public static void main(String[] args) {
        //Used when there is any condition, so its conditional operator

        int a=10, b=20, c=30, max;
        max = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println(max);

        //We use ternary operators over if else statements cause it reduces our work and we are able to perform work in a line


    }
}