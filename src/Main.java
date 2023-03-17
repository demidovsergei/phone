public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int replenishment = 1100;
        int start = 1000;
        int bonus;
        int finalAmount;
        if (replenishment > start) {
            bonus = replenishment / 100;
            finalAmount = initialAmount + replenishment + bonus;
            System.out.println(finalAmount);
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}
