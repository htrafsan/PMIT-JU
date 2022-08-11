/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
public class BankAccount {
	public String name,id;
	public double balance;

	/**
	 * 
	 */
	public BankAccount(String n,String s_id,double bl) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.id=s_id;
		this.balance=bl;
	}

	public void deposit(double depAmount){
		balance+=depAmount;
	}
	public void withdraw(double withAmount){

		if(balance>withAmount){
			balance-=withAmount;
		}
		else{
			System.out.printf("Balance Not Enough");
		}

	}

	public double getBalance() {
		return balance;
	}

	public void display() {
		System.out.println("Name:"+name+"Id:"+id+"Balance:"+balance);
	}

	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/
}