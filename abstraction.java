interface payment
{
         void make_payment(double amount);
         void refund(double amount);
}

    class creditcardpayment implements payment{
        @Override
        public void make_payment(double amount) {
            System.out.println("Payment is by credit "+amount);
        }
        public void refund(double amount){
            System.out.println("refund by credit "+amount);
        }
    }

    class paypalpayment implements payment {
        @Override
        public void make_payment(double amount) {
            System.out.println("Payment is by paypal " + amount);
        }

        public void refund(double amount) {
            System.out.println("refund by paypal " + amount);
        }
    }

class Mainn{
    public static void main(String[] args) {
        payment p1 = new creditcardpayment();
        payment p2 = new paypalpayment();

        p1.make_payment(2000);
        p1.refund(100);
        p2.make_payment(3000);
        p2.refund(100);
    }
}

