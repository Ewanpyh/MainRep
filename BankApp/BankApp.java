package BankApp;

import java.util.Scanner;
import java.util.HashMap;


class User{
    private int Id;
    private String name;
    private double balance;
    private int password;

    public User(int Id, String name, double balance, int password){
        this.Id = Id;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

    public int getPassword(){
        return password;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

public class BankApp {
    
    public boolean registerUser(){
        return false;
    }

    public boolean loginUser(){
        return true;
    }


    public static void main(String[] args){
        BankApp bankapp = new BankApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Choose the options:");
        System.out.println("1. sign up");
        System.out.println("2. login");
        System.out.println("3. exit");
        System.out.print("Enter the number of the option:");
        int firstcase = scanner.nextInt();
            switch (firstcase) {
                case 1: 
                bankapp.registerUser();
                    break;
                case 2:
                bankapp.loginUser();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
