public class Ex3 {
    public static void main(String[] args) {
        //exercise 1
        int startPeriod = 1822, endPeriod = 2122;
        int year = 0;
        while (year <= endPeriod) {
            if (year >= startPeriod) {
                System.out.println(year);
            }
            year += 79;
        }
        System.out.println();
        //exercise 2
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"=" + (2 * i));
        }
    }
}
