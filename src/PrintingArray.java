class PrintingArray{
    public static void main(String[] args) {
        //Different ways to print array elements in java
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //for-each loop syntax - perk - no condition, no increase, decrease, no print
        //for-each loop is better than for loop

        for (int b : a){
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
