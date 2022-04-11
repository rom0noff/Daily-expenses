package uz.inheritance.oop;

import java.util.Scanner;

public  class  FinanceData{

    private double breakfastfinance;
    private double lunchfinance;
    private double dinnerfinance;
    private double togofinance;
    private double backgofinance;
    private double salary;
    private double smoke;
    private double party;

    public double getParty() {
        return party;
    }

    public void setParty(double party) {
        this.party = party;
    }



    public double getSmoke() {
        return smoke;
    }

    public void setSmoke(double smoke) {
        this.smoke = smoke;
    }

    public double getBreakfastfinance() {
        return breakfastfinance;
    }

    public void setBreakfastfinance(double breakfastfinance) {
        this.breakfastfinance = breakfastfinance;
    }

    public double getLunchfinance() {
        return lunchfinance;
    }

    public void setLunchfinance(double lunchfinance) {
        this.lunchfinance = lunchfinance;
    }

    public double getDinnerfinance() {
        return dinnerfinance;
    }

    public void setDinnerfinance(double dinnerfinance) {
        this.dinnerfinance = dinnerfinance;
    }

    public double getTogofinance() {
        return togofinance;
    }

    public void setTogofinance(double togofinance) {
        this.togofinance = togofinance;
    }

    public double getBackgofinance() {
        return backgofinance;
    }

    public void setBackgofinance(double backgofinance) {
        this.backgofinance = backgofinance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Scanner scanner = new Scanner(System.in);

    public  double info(){

        double shareSalary = salary * 0.2;
        double halfSalary = salary * 0.8;
        double sum = backgofinance + breakfastfinance + dinnerfinance + lunchfinance + party + smoke + togofinance;

        if (halfSalary - sum < 0) {
            System.out.println("Siz o'zizga ajratgan pulingizdanam oshiqcha rasxod qildingiz!!!");
            System.out.println("Yig'ib yurgan omonatdagi pilingizdan ishlatishni hohlaysizmi?");
            System.out.println("1. Xa xoxlayman | 2. Xoxlamayman ertaga qora kunlarga asrab qo'yibman");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Aniq ishonchingiz komilmi ertaga to'y yoki tug'ilgan kun berishingiz mumkn!");
                    System.out.println("Omonatdagi pulingiz: " + shareSalary);
                    System.out.println("1. Xa aniq ishonchim komil ishlataman.   | 2. Hop mayli ishlatmayman.");
                    switch (scanner.nextInt()) {
                        case 1: {
                            halfSalary =halfSalary + shareSalary;
                            shareSalary = 0;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Sizning Omonatdagi pulingiz: "+shareSalary);
        System.out.println("Rasxodingizdan ortiqcha qolgani: "+(halfSalary - sum));

        return 0;
    }


}
