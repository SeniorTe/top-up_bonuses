public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int refill = 1350;
        int accrualStep = 100;
        int accrualLimit = 1000;
        int bonus = refill / accrualStep;

        int balance;
        if (refill > accrualLimit) {
            balance = startingBalance + refill + bonus;
            System.out.println("Баланс вашего лицевого счета " + balance);
            System.out.println("Количество начисленных бонусных рублей " + bonus);
        } else {
            balance = startingBalance + refill;
            System.out.println("Баланс вашего лицевого счета " + balance);

        }

    }
}