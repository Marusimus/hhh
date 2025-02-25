public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amound = 1000;
        int bonus;
        boolean actionParticipant = amound > 1000;

        if (actionParticipant) {
            bonus = amound / 100;
            int total = amound + bonus + balance;
            System.out.println("Количество бонусных рублей: " + bonus + " Итоговый счет: " + total);
        } else {
            bonus = 0;
            int total = amound + bonus + balance;
            System.out.println("Количество бонусных рублей: " + bonus + " Итоговый счет: " + total);
        }

    }
}