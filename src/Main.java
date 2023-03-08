public class Main {
    public static void main(String[] args) {
        int nashsumm = 100;
        int popolnenie = 1100;
        int start = 1000;
        int bonus;
        int stopsumm;
        if (popolnenie > start) {
            bonus = popolnenie / 100;
            stopsumm = nashsumm + popolnenie + bonus;
            System.out.println(stopsumm);
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}