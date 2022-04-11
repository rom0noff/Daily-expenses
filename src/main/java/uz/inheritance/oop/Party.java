package uz.inheritance.oop;

import java.util.Scanner;

public class Party extends Head{
    FinanceData financeData = new FinanceData();
    Scanner scanner = new Scanner(System.in);
    public void PartyInfo(){
        System.out.println("Bugun kechka to'y yoki tug'ilgan kun yo'qmi");
        System.out.println("1. Bor boraman. | 2. Bo'sayam bormiman.");
        switch (Head.numb = scanner.nextInt()){
            case 1 :
                System.out.println("Tabrik uchun qancha xarajat qilasiz?");
                financeData.setParty(scanner.nextDouble());
                break;
            case 2 :
                System.out.println("To'g'ri qilasiz. Uyda kechki ovqatni yeb yotgan yaxshi...");
                break;
        }
    }
}
