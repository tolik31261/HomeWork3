public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 127;
        System.out.println("Значение переменной a, " + "c типом byte, равно: " + a );
        short b = 32767;
        System.out.println("Значение переменной b, " + "c типом short, равно: " + b );
        int c = 2147483647;
        System.out.println("Значение переменной c, " + "c типом int, равно: " + c );
        long d = 12021065025312L;
        System.out.println("Значение переменной d, " + "c типом long, равно: " + d );
        float e = 3.1f;
        System.out.println("Значение переменной e, " + "c типом float, равно: " + e );
        double f = 1.32489723498230;
        System.out.println("Значение переменной f, " + "c типом double, равно: " + f );
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentLudmila = 23;
        byte studentAnna = 27;
        byte studentEkaterina = 30;
        short paper = 480;
        int paperOneStudent = paper / (studentAnna + studentEkaterina + studentLudmila);
        System.out.println("На каждого ученика расчитано " + paperOneStudent + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottlePerTwoMinutes = 16;
        int bottlePerOneMinutes = bottlePerTwoMinutes / 2;
        int bottlePerTwentyMinutes = bottlePerOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + bottlePerTwentyMinutes + " бутылок");
        int bottlePerDay = bottlePerOneMinutes * 24 * 60;
        System.out.println("За сутки машина произвела " + bottlePerDay + " бутылок");
        int bottlePerThreeDay = bottlePerOneMinutes * 24 * 60 * 3;
        System.out.println("За 3 дня машина произвела " + bottlePerThreeDay + " бутылок");
        int bottlePerMonth = bottlePerDay * 30;
        System.out.println("За месяц машина произвела " + bottlePerMonth + " бутылок");
    }
}
