public class account {
    public static void main(String[] args) {
        int score =500;
        int refill =2500;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }
        int balance = score + refill + bonus;
        System.out.println(" Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}


