public class CreditPaymentService {
    public double calculate(double years, double interestRate, double creditAmount) {
        double mounth = years * 12;
        double percent = interestRate / 100 / 12;
        double degree = Math.pow(1 + percent, mounth);
        double annuity = ((percent * degree) / (degree - 1));
        double monthlyPayment = Math.round(creditAmount * annuity);
        return monthlyPayment;
    }
}