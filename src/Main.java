public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}
