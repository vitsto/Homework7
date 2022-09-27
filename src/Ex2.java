public class Ex2 {
    public static void main(String[] args) {
        double initialSum = 15000;
        double goal = 12_000_000;
        double ratePerMonth = 0.07;

        //exercise 1
        double deposit = initialSum;

        for (int month = 1; deposit <= goal; month++) {
            deposit += deposit * ratePerMonth;
            System.out.printf("Месяц: %d | Сумма на счету: %.2f \n", month, deposit);
        }
        System.out.println();

        //exercise 2
        deposit = initialSum;
        for (int month = 1; deposit <= goal; month++) {
            deposit += deposit * ratePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц: %d | Сумма на счету: %.2f \n", month, deposit);
            }
        }
        System.out.println();

        //exercise 3
        deposit = initialSum;
        int period = 9 * 12;
        for (int month = 1; month <= period; month++) {
            deposit += deposit * ratePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц: %d | Сумма на счету: %.2f \n", month, deposit);
            }
        }

        System.out.println();

        //exercise 4
        int currentFriday = 2;
        while (currentFriday <= 31) {
            System.out.println("Сегодня пятница, " + currentFriday + "-e число. Необходимо сдать отчет");
            currentFriday += 7;
        }
    }
}
