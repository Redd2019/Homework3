public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int sugar = 34508;
        byte salt = 121;
        short pepper = 323;
        long rice = 1500000;
        float apples = 3.14F;
        double cherries = 5.764527882645782;

        System.out.println("Значение переменной sugar с типом int равно " + sugar);
        System.out.println("Значение переменной salt с типом byte равно " + salt);
        System.out.println("Значение переменной pepper с типом short равно " + pepper);
        System.out.println("Значение переменной rice с типом long равно " + rice);
        System.out.println("Значение переменной apples с типом float равно " + apples);
        System.out.println("Значение переменной cherries с типом double равно " + cherries);
    }

    //

    public static void task2 () {
        System.out.println("Задача 2");
        float port = 27.12f;
        long number = 987678965549L;
        double people = 2.786;
        short mass = 569;
        int temperature = -159;
        int army = 27897;
        byte car = 67;
           }
     //

    public static void task3 () {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short sheetsTotal = 480;
        int pupilTotal = LP + AS + EA;
        int sheetsPerPupil = sheetsTotal / pupilTotal;
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");
    }

    //

    public static void task4 () {
        System.out.println("Задача 4");
        byte numberBottles = 16;
        byte time1 = 2;
        int bottlePerMinute = numberBottles / time1;
        byte time2 = 20;
        int numberBottles2 = bottlePerMinute * time2;
        short time3 = 1440;
        int numberBottles3 = bottlePerMinute * time3;
        short time4 = 4320;
        int numberBottles4 = bottlePerMinute * time4;
        int time5 = 43200;
        int numberBottles5 = bottlePerMinute * time5;
        System.out.println("За " + time2 + " минут машина произвела " + numberBottles2 + " штук бутылок.");
        System.out.println("За " + time3 + " минут машина произвела " + numberBottles3 + " штук бутылок.");
        System.out.println("За " + time4 + " минут машина произвела " + numberBottles4 + " штук бутылок.");
        System.out.println("За " + time5 + " минут машина произвела " + numberBottles5 + " штук бутылок.");
    }



}