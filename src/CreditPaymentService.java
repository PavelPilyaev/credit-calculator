public class CreditPaymentService {
    public int calculate(int amount, int term) {
        double percent = 9.99;
        int month = (term * 12);
        double bet = (percent / 12 / 100);
        int a = 1;
        double staples = (a + bet);
        double fraction = Math.pow(staples, month);


        double ratio = bet * fraction / (fraction - a) * amount;
        return (int) ratio;

    }


}