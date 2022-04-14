package uz.inheritance.oop;

import java.util.Scanner;

public class MainPolly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FinanceData financeData = new FinanceData();

        PersonMenu personMenu = new PersonMenu();
        personMenu.MenuInfo();
        Head.num = scanner.nextInt();
        personMenu.SwitchInfo();
        financeData.setSalary(scanner.nextDouble());
        financeData.info();
        personMenu.SmokeInfo();
        Head.numm = scanner.nextInt();
        System.out.println("============================");
        financeData.info();
        System.out.println(financeData.smoke);
        Fooddata fooddata = new Fooddata();
        fooddata.BreakfastInfo();
        financeData.setBreakfastfinance(scanner.nextDouble());
        financeData.info();
        System.out.println("============================");

        TransportData transportData = new TransportData();
        transportData.ToGoInfo();
        financeData.setTogofinance(scanner.nextDouble());
        financeData.info();

        System.out.println("============================");

        fooddata.LunchInfo();
        financeData.setLunchfinance(scanner.nextDouble());
        financeData.info();
        System.out.println("============================");

        transportData.BackGoInfo();
        financeData.setBackgofinance(scanner.nextDouble());
        financeData.info();
        System.out.println("============================");

        Party party = new Party();
        party.PartyInfo();
        financeData.info();
        fooddata.DinnerInfo();
        financeData.setDinnerfinance(scanner.nextDouble());
        financeData.info();
        System.out.println("============================");
        financeData.Ininfo(financeData.halfSalary, financeData.shareSalary, financeData.sum, financeData.salary1);





    }
}
