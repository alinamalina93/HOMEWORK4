public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //Задание 2
        int a = 5;
        for (a = 5; a < 31; a = a + 7) {
            System.out.println("сегодня пятница " + a + " число " + " нужно подготовить отчёт");
        }
        //Задание 3
        int year1 = 1822, year2= 2122;
        for (int year = 0; year <= year2; year = year + 79) {
            if (year >= year1) {


                System.out.println(year);

            }
        }

    }
}


