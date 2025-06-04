class Recursion{

    int sum(int b){
        if(b>0) return b + sum(b-1); //calling
        else return 0;
    }

    public static void main(String[] args) {
        //Sum of first n natural numbers
        Recursion r = new Recursion();
        int ans = r.sum(3);    //calling

        System.out.println(ans);
    }
}