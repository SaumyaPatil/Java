class StringComparison{
    public static void main(String[] args) {
        String a = "Lion";   //String literal
//        String b = "Tiger";

        String b = new String("Lion");
        //If you compare a and c, it gives false as we have created objects in two differernt ways.
        //It then compares the ref variable in such case.
        //Creating string object with same ref variable name throws compiler error.

        if (a==b){   //It compares the object
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        //Method 2 - This method looks at the object only while == comparison operator
        //looks at the object only if you create objects using same way otherwise it looks at the ref variable
        if (a.equals(b)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}