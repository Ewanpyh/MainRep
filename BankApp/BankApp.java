package BankApp;

import java.util.Scanner;
import java.util.HashMap;


class User{
    private int Id;
    private double balance;
    private int password;

    public User(int Id, double balance, int password){
        this.Id = Id;
        this.balance = balance;
        this.password = password;
    }

    public int getId(){
        return Id;
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
    private HashMap<User, Integer> users = new HashMap<>(); //List of users
    private String currentUser;

    public boolean registerUser(int id, int password){

        return true;
    }

    public boolean loginUser(int id, int pass){
        //another case here if User exists

        return true;
    }


    public static void main(String[] args){
        BankApp bankapp = new BankApp();
        Scanner scanner = new Scanner(System.in);
        int id;
        while (true) {
        System.out.println("Choose the options:");
        System.out.println("1. sign up");
        System.out.println("2. login");
        System.out.println("3. exit");
        System.out.print("Enter the number of the option:");
        int firstcase = scanner.nextInt();
            switch (firstcase) {
                case 1: 
                System.out.println("Enter the users id:");
                id = scanner.nextInt();
                System.out.println("Enter the password:");
                int password = scanner.nextInt();
                bankapp.registerUser(id, password);
                    break;
                case 2:
                System.out.print("Enter user's id: ");
                id = scanner.nextInt();
                System.out.print("Enter the password: ");
                int pass = scanner.nextInt();
                bankapp.loginUser(id, pass);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
