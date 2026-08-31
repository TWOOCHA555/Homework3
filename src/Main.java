//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int myInt = 1000;
        byte myByte = 50;
        short myShort = 10000;
        long myLong = 9000000000L;
        float myFloat = 3.14f;
        double myDouble = 2.71828;

        System.out.println("Значение переменной myInt с типом int равно " + myInt + ".");
        System.out.println("Значение переменной myByte с типом byte равно " + myByte + ".");
        System.out.println("Значение переменной myShort с типом short равно " + myShort + ".");
        System.out.println("Значение переменной myLong с типом long равно " + myLong + ".");
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat + ".");
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble + ".");

        double val1 = 27.12;
        long val2 = 987678965549L;
        double val3 = 2.786;
        int val4 = 569;
        int val5 = -159;
        int val6 = 27897;
        int val7 = 67;

        System.out.println("double = " + val1);
        System.out.println("long = " + val2);
        System.out.println("double = " + val3);
        System.out.println("int = " + val4);
        System.out.println("int = " + val5);
        System.out.println("int = " + val6);
        System.out.println("int = " + val7);

        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("Всего учеников = " + totalStudents);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        int bottlesPerTwoMinutes = 16;
        int minutesInTwoMinutes = 2;
        int bottlesPerMinute = bottlesPerTwoMinutes / minutesInTwoMinutes;

        int minutes20 = 20;
        int bottles20Minutes = bottlesPerMinute * minutes20;

        int minutesInHour = 60;
        int hoursInDay = 24;
        int minutesInDay = hoursInDay * minutesInHour;
        int bottlesPerDay = bottlesPerMinute * minutesInDay;

        int days3 = 3;
        int bottles3Days = bottlesPerDay * days3;

        // Если учитывать, что в месяце 30 дней
        int daysInMonth = 30;
        int bottlesPerMonth = bottlesPerDay * daysInMonth;

        System.out.println("За 20 минут машина произвела " + bottles20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;

        int numberOfClasses = totalCans / cansPerClass;
        int totalWhiteCans = numberOfClasses * whitePerClass;
        int totalBrownCans = numberOfClasses * brownPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        int bananasCount = 5;
        int bananaWeight = 80;

        int milkMl = 200;
        int milkWeightPer100Ml = 105;

        int iceCreamCount = 2;
        int iceCreamWeight = 100;

        int eggsCount = 4;
        int eggWeight = 70;

        int totalBananaWeight = bananasCount * bananaWeight;
        int totalMilkWeight = (milkMl / 100) * milkWeightPer100Ml;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggWeight = eggsCount * eggWeight;

        int totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("Общий вес завтрака: " + totalWeightGrams + " грамм");
        System.out.println("Общий вес завтрака: " + totalWeightKg + " килограмм");

        int targetWeightLossKg = 7;
        int targetWeightLossGrams = targetWeightLossKg * 1000;

        int lossPerDayMin = 250;
        int lossPerDayMax = 500;

        int daysMin = targetWeightLossGrams / lossPerDayMin;
        int daysMax = targetWeightLossGrams / lossPerDayMax;
        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("При потере 250 г в день потребуется " + daysMin + " дней");
        System.out.println("При потере 500 г в день потребуется " + daysMax + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней");

        String[] names = {"Маша", "Денис", "Кристина"};
        int[] currentMonthlySalary = {67760, 83690, 76230};
        double raisePercent = 1.1;

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int monthlyBefore = currentMonthlySalary[i];
            int monthlyAfter = (int) (monthlyBefore * raisePercent);

            int annualBefore = monthlyBefore * 12;
            int annualAfter = monthlyAfter * 12;
            int annualDifference = annualAfter - annualBefore;

            System.out.println(name + " теперь получает " + monthlyAfter + " рублей. Годовой доход вырос на " + annualDifference + " рублей");
        }
    }
}