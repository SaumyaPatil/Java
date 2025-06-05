class StringReverse{
    public static void main(String[] args) {

        //String buffer is a pre-defined class in java that has a method reverse()
        //that reverses the string created by object of the class only
        StringBuffer r = new StringBuffer("Learn Coding");
        System.out.println(r.reverse());


        //Same as string buffer class
        StringBuilder ref = new StringBuilder("Learn Java");
        System.out.println(ref.reverse());


        //Manual way
        String k = "Learn Java";
        String p = "";
        int l;
        l=k.length();
        for (int i = l-1; i >= 0; i--) {
            p=p+k.charAt(i);
        }

        System.out.println(p);
    }
}