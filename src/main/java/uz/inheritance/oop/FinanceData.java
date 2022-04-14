package uz.inheritance.oop;

import java.util.Scanner;

public  class  FinanceData{

    private double breakfastfinance;
    private double lunchfinance;
    private double dinnerfinance;
    private double togofinance;
    private double backgofinance;
    private double salary;
    public double smoke;
    private double party;


    public FinanceData(){

    }

    public double getParty() {
        return party;
    }

    public void setParty(double party) {
        this.party = party;
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
    double salary1;
    double shareSalary;
    double halfSalary;
    double sum;

    public  double info() {
        salary1 = salary / 30;
        shareSalary = salary1 * 0.2;
        halfSalary = salary1 * 0.8;
        sum = backgofinance + breakfastfinance + dinnerfinance + lunchfinance + party + smoke + togofinance;


            if (halfSalary - sum < 0) {
                if (smoke > 0) {
                    System.out.println("Brat chekishni tashlang. Sog'liq uchun zarar va cho'ntakka zarar.");
                }
                System.out.println("----------Bankrot!!!----------");
                System.out.println("Sizning Omonatdagi pulingiz: " + shareSalary);
                System.out.println("Rasxodingizdan ortiqcha qolgani: " + (halfSalary - sum));
                System.out.println("Rasxodingiz: " + (sum));
                System.out.println(smoke);

                System.out.println("====================================");
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
                                halfSalary = halfSalary + shareSalary;
                                shareSalary = 0;
                                break;
                            }
                            case 2: {
                                System.out.println("Unda yaxshi.");
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            return halfSalary;
    }
    public double Ininfo(double halfSalary, double shareSalary, double sum, double salary1){
        if (halfSalary - sum > 0 && halfSalary - sum < 20000) {
            System.out.println("Sizning Omonatdagi pulingiz: " + shareSalary);
            System.out.println("Rasxodingizdan ortiqcha qolgani: " + (halfSalary - sum));
            System.out.println("Rasxodingiz: " + (sum));
            System.out.println("Bir kunlik mavjud bo'lgan pulingiz: " + salary1);
            System.out.println("Yaxshi lekin tejamkorroq bo'lish kerak.");
        } else if (halfSalary - sum > 20000 && halfSalary - sum < 50000) {
            System.out.println("Sizning Omonatdagi pulingiz: " + shareSalary);
            System.out.println("Rasxodingizdan ortiqcha qolgani: " + (halfSalary - sum));
            System.out.println("Rasxodingiz: " + (sum));
            System.out.println("Bir kunlik mavjud bo'lgan pulingiz: " + salary1);
            System.out.println("Yaxshi buni ham omonatga qo'shib qo'ying..");
        } else if (halfSalary - sum > 50000 && halfSalary - sum < 80000) {
            System.out.println("Sizning Omonatdagi pulingiz: " + shareSalary);
            System.out.println("Rasxodingizdan ortiqcha qolgani: " + (halfSalary - sum));
            System.out.println("Rasxodingiz: " + (sum));
            System.out.println("Bir kunlik mavjud bo'lgan pulingiz: " + salary1);
            System.out.println("Otlichni ekonom........");
        }
        return 0;
    }
}
