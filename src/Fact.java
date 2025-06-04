class Fact{

    int fact(int n){
        if (n == 1)return 1;
        else return n * fact(n-1);
    }

    public static void main(String[] args) {

        Fact r = new Fact();
        int ans = r.fact(4);
        System.out.println(ans);
    }
}