package uz.inheritance.oop;

import java.util.Scanner;

public class TransportData extends Head {
    Scanner scanner = new Scanner(System.in);
    public String ToGoInfo(){

        if(Head.num == 1){
            System.out.println("Ertalab ishga qanday transportda borasiz?");
            System.out.println("1.Avtobusda");
            System.out.println("2.Shaxsiy mashinamda");
            System.out.println("3.Taksida");
            switch (Head.number = scanner.nextInt()){
                case 1:{
                    System.out.println("Avtobusga qancha xarajat qilasiz?");
                    break;
                }
                case 2: {
                    System.out.println("Mashinangiz yoqilg'isi xarajati qancha?");
                    break;
                }
                case 3: {
                    System.out.println("Taksiga qancha xarajat qilasiz?");
                    break;
                }
                default:
                    System.out.println("error!!!");
                    break;
            }
        }
        else if(Head.num == 2){
            System.out.println("Ertalab o'qishga qanday transportda borasiz?");
            System.out.println("1.Avtobusda");
            System.out.println("2.Shaxsiy mashinamda");
            System.out.println("3.Taksida");
            switch (Head.number = scanner.nextInt()){
                case 1:{
                    System.out.println("Avtobusga qancha xarajat qilasiz?");
                    break;
                }
                case 2: {
                    System.out.println("Mashinangiz yoqilg'isi xarajati qancha?");
                    break;
                }
                case 3: {
                    System.out.println("Taksiga qancha xarajat qilasiz?");
                    break;
                }
                default:
                    System.out.println("error!!!");
                    break;
            }
        }
        else if(Head.num == 3){
            System.out.println("Ota ehtiyojingiz uchun qanday transportdan foydalanasiz?");
            System.out.println("1.Avtobusda");
            System.out.println("2.Shaxsiy mashinamdan");
            System.out.println("3.Taksidan");
            switch (Head.number = scanner.nextInt()){
                case 1:{
                    System.out.println("Avtobusga qancha xarajat qilasiz?");
                    break;
                }
                case 2: {
                    System.out.println("Mashinangiz yoqilg'isi xarajati qancha?");
                    break;
                }
                case 3: {
                    System.out.println("Taksiga qancha xarajat qilasiz?");
                    break;
                }
                default:
                    System.out.println("ex otamma otamma boshidan kiritng !!!");
                    break;
            }
        }
        else System.out.println("Manmcha adashtingiz!!!");
        return null;
    }


    public String BackGoInfo(){

        if(Head.num == 1){
            System.out.println("Ishdan qanday transportda qaytasiz?");
            System.out.println("1.Avtobusda");
            System.out.println("2.Shaxsiy mashinamda");
            System.out.println("3.Taksida");
            switch (Head.number = scanner.nextInt()){
                case 1:{
                    System.out.println("Avtobusga qancha xarajat qilasiz?");
                    break;
                }
                case 2: {
                    System.out.println("Mashinangiz yoqilg'isi xarajati qancha?");
                    break;
                }
                case 3: {
                    System.out.println("Taksiga qancha xarajat qilasiz?");
                    break;
                }
                default:
                    System.out.println("error!!!");
                    break;
            }
        }
        else if(Head.num == 2){
            System.out.println("Student o'qishdan qanday transportda qaytasan?");
            System.out.println("1.Avtobusda");
            System.out.println("2.Shaxsiy mashinamda");
            System.out.println("3.Taksida");
            switch (Head.number = scanner.nextInt()){
                case 1:{
                    System.out.println("Avtobusga qancha xarajat qilasiz?");
                    break;
                }
                case 2: {
                    System.out.println("Mashinangiz yoqilg'isi xarajati qancha?");
                    break;
                }
                case 3: {
                    System.out.println("Taksiga qancha xarajat qilasiz?");
                    break;
                }
                default:
                    System.out.println("error!!!");
                    break;
            }
        }
        return null;
    }
}
