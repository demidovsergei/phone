public class Main {
    public static void main(String[] args) {
        int initial_amount = 100;
        int replenishment = 1100;
        int start = 1000;
        int bonus;
        int final_amount;
        if (replenishment > start) {
            bonus = replenishment / 100;
            final_amount = initial_amount + replenishment + bonus;
            System.out.println(final_amount);
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}