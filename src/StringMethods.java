class StringMethods{
    public static void main(String[] args) {

        String a = "ANKIT";
        String b = "rahul";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        String c = "       ankush          ";
        String d = "Leaen";
        System.out.println(c.trim()); //removes empty spaces in the string
        System.out.println(d.isEmpty());  //checks if the string is empty


        System.out.println(b.charAt(2));  //char at index provided
        System.out.println(b.indexOf('K')); //index of provided character, if char abscent, prints -1

        System.out.println(b.equals(a));
        System.out.println(d.replace('o', 'k')); //replaces all 'o' with 'k', if 'o' abscent, prints the string itself
    }
}