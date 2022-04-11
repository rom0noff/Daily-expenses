package uz.inheritance.oop;

import java.util.Scanner;

public class PersonMenu extends Head{
    Scanner scanner = new Scanner(System.in);
    public void MenuInfo() {

        System.out.println("Assalom Aleykum siz bu yerda 1 kunlik xarajatlaringizni ko'rishingiz mumkin.");
        System.out.println("");
        System.out.println("1.Ishlaysizmi?");
        System.out.println("2.O'qiysizmi?");
        System.out.println("3.Pensiyonermisiz?");

    }
//    public int num;
    public boolean SwitchInfo(){
        switch (Head.num){
            case 1 : {
                System.out.println("Qancha maosh olasiz?");
                break;
            }
            case 2 : {
                System.out.println("Oyiga qancha jo'natishadi uydagilar?");
                break;
            }
            case 3 : {
                System.out.println("Oyiga qancha pensiya olasiz?");
                break;
            }
            default:
                System.out.println("errror!!!");
        }

        return true;
    }
    FinanceData financeData = new FinanceData();
    public void SmokeInfo(){
        System.out.println("Chekasizmi?");
        System.out.println(" 1.Xa | 2.Yoq");
        switch (Head.numm){
            case 1 : financeData.setSmoke(20000);
            case 2 : financeData.setSmoke(0);
        }
    }
}
