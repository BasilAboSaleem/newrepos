
package oop1;

import java.util.Scanner;


public class OOP1 {

    
    public static void main(String[] args) {
        /*
        BankAccount bc1=new BankAccount();
         bc1.setAccountNumber("625256");
         bc1.setAccountType(1);
         bc1.setBalanc(550);
         bc1.setBassworde("254861gf");
         bc1.setHoldarId("54813549");
         bc1.setHoldarName("basil saleem");
         bc1.setIsBlocked(false);
         
        BankAccount bc2=new BankAccount();
         bc2.setAccountNumber("84862");
         bc2.setAccountType(1);
         bc2.setBalanc(8962);
         bc2.setBassworde("5424ghghfh7");
         bc2.setHoldarId("9812453");
         bc2.setHoldarName("beso beso");
         bc2.setIsBlocked(false);
         
         BankAccount[] accounts={bc1, bc2};
 
        Scanner s=new Scanner(System.in);   
        System.out.println("Enter your ID: ");
        String id =s.nextLine();
        BankAccount tmp=null;
        boolean validUser =false;
        for(BankAccount d: accounts){
            if(d.getHoldarId().equals(id)){
                tmp= d;
                validUser=true;
            }
        }
        if(!validUser){
            System.out.println("invalid User ID");
            System.exit(0);
            
        }
        boolean isValiPw= false;
        for(int i=0; i<3;i++){
            System.out.println("Enter password (Attemp "+(i+1)+": ");
            String password=s.nextLine();
            if(password.equals(tmp.getBassworde())){
                isValiPw=true;
                break;
            }
            if(isValiPw==false){
                System.out.println("Go home.");
                tmp.setIsBlocked(true);
                System.exit(0);
            }
            System.out.println("Welcome to bank of nothing");
            System.out.println("what do you want to do");
            System.out.println("1/draw.  2/deposit");
            int choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter ammount to draw :");
                    float ammount =s.nextFloat();
                    boolean drawResalt = tmp.draw(ammount);
                    if(drawResalt){
                        System.out.println("Draw complate successfully.  Your current balance ="+tmp.getBalanc());
                    }else{
                        System.out.println("You cannot draw");
                    }
                    
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("invalidoption");
                    
            }
            
        }*/
        
        int z=10;
       
       int q= App.getNo(z);
       System.out.println(z);

        
        
    }
    
}
