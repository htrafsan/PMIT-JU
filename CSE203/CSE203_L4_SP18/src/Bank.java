/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
public class Bank{

    /**
     *
     public Bank() {
     // TODO Auto-generated constructor stub
     }

     /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankAccount ba= new BankAccount("Rafsan ","18101009 ", 9000);
        ba.withdraw(2000);
        ba.display();	//print after withdraw
        ba.deposit(600);
        ba.display();	//print after deposit
    }
}