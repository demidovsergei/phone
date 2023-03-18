public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int replenishment = 100;
        int start = 1000;
        int bonus;
        int finalAmount;
        if (replenishment > start) {
            bonus = replenishment / 100;
            finalAmount = initialAmount + replenishment + bonus;
        } else {
            finalAmount = initialAmount + replenishment;
            bonus = 0;
        }
        System.out.println(finalAmount);
        System.out.println(bonus);
    }
}
