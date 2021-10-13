public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double interestRate = 9.99;
        double years = 1;
        double monthlyPayment = service.calculate(years, interestRate, creditAmount);
        System.out.println(monthlyPayment);

        creditAmount = 1_000_000;
        interestRate = 9.99;
        years = 2;
        monthlyPayment = service.calculate(years, interestRate, creditAmount);
        System.out.println(monthlyPayment);

        creditAmount = 1_000_000;
        interestRate = 9.99;
        years = 3;
        monthlyPayment = service.calculate(years, interestRate, creditAmount);
        System.out.println(monthlyPayment);

    }
}
