public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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

    public static void task5 () {
        System.out.println("Задача 5");
        byte canSum = 120;
        byte whiteCanClass = 2;
        byte brownCanClass = 4;
        int cansForClass = whiteCanClass + brownCanClass;
        int numberOfClasses = canSum / cansForClass;
        int numberWhiteCans = numberOfClasses * whiteCanClass;
        int numberBrownCans = numberOfClasses * brownCanClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberWhiteCans + " банок белой краски и " + numberBrownCans + " банок коричневой краски.");

    }

    public static void task6 () {
        System.out.println("Задание 6");
        byte bananaNumber = 5;
        byte bananaWeight = 80;
        byte bananaTotal = (byte) (bananaNumber * bananaWeight);
        int milkNumber = 200;
        byte milkWeight = 105;
        byte milkTotal = (byte) (milkNumber * milkWeight);
        byte iceCreamNumber = 2;
        byte iceCreamWeight = 100;
        byte iceCreamTotal = (byte) (iceCreamNumber * iceCreamWeight);
        byte eggsNumber = 4;
        byte eggsWeight = 70;
        byte eggsTotal = (byte) (eggsNumber * eggsWeight);
        int productsTotal = bananaTotal + milkTotal + iceCreamTotal + eggsTotal;
        System.out.println("Вес спортзавтрака в граммах составляет " + productsTotal + " грамм.");

        float productsTotalKg = productsTotal / 100f;
        System.out.println("Вес спортзавтрака в килограммах составляет " + productsTotalKg + " килограмм.");
    }

    public static void task7 () {
        System.out.println("Задание 7");
        double weightToLose = 7 / 1000f;
        short dailyWeight1 = 250;
        short dailyWeight2 = 500;
        double numberOfDays1 = weightToLose / dailyWeight1;
        double numberOfDays2 = weightToLose / dailyWeight2;
        double numberOfDaysAverage = (numberOfDays1 + numberOfDays2) / 2;
        System.out.println("Если спортсмен будет терять каждый день " + dailyWeight1 + " грамм, то на похудение уйдет " +
                numberOfDays1 + " дней, если будет терять каждый день " + dailyWeight2 + " грамм, то на похудение уйдет " + numberOfDays2
        + " дней. В среднем может потребоваться " + numberOfDaysAverage + (" дней на похудение.") );

    }


}

