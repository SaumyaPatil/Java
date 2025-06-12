interface customerRaj{
    int amt = 5;        //public + static + final

    //This method is made abstract by default as its only declared here and not defined.
    void purchase();          //public + abstract
}

class InterfaceVariables implements customerRaj{
    //Interface is used where there's contract between customer and seller.
    //Seller provides service to customer.

    @Override
    public void purchase(){
        //This seller can sell more rice than required to the customer to make more money.
        //Thats why its made final by default to keep the value same throughout

        //If its relations with class are not good, it can go to other seller.
        System.out.println("Raj needs " + amt + " Kg rice");
    }
}

class Check{
    public static void main(String[] args) {
        customerRaj c = new InterfaceVariables();
        c.purchase();
        System.out.println(customerRaj.amt);
    }
}
