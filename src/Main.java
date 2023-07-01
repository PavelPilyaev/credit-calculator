public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000000, 1));

        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000000, 2));

        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000000, 3));

    }
}