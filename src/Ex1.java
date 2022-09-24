public class Ex1 {
    public static void main(String[] args) {
        //block 1
        //exercise 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i--; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        //exercise 3
        int population = 12_000_000;
        for (int year = 2020; year < 2030; year++) {
            int bornPeople = 0;
            int diedPeople = 0;
            for (i = 1000; i <= population; i += 1000) {
                bornPeople += 17;
                diedPeople += 8;
            }
            population = population + bornPeople - diedPeople;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

    }
}