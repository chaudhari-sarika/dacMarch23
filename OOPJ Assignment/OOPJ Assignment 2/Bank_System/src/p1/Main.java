package p1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("---------Welcome to Bank------");
			    System.out.println();
			    int option;
			    BankAccount acc = null;

			    while ((option = BankAccount.showMenu()) != 0) {
			      switch (option) {
			        case 1:

			          System.out.println("Enter the Account holders name :");
			          String name = sc.nextLine();
			          acc = new BankAccount(name);
			          break;

			        case 2:
			           
			           if (acc != null && acc.validateData()){
			              
			              System.out.println("How much money you want to deposit");
			               acc.depositMoney(sc.nextInt());
			           }
			           else System.out.println("Account not yet created");
			         
			          break;
			        case 3:
			          if (acc != null && acc.validateData()){
			          System.out.println("How much money you want to withdraw");
			           acc.withdrawMoney(sc.nextInt());
			          }
			          else System.out.println("Account not yet created");
			         
			          break;
			        case 4:
			          if (acc != null && acc.validateData())
			          System.out.println(acc.getAccBal());
			          else System.out.println("Account not yet created");
			          break;

			        case 5:
			          if (acc != null && acc.validateData())
			          System.out.println(acc);
			          else System.out.println("Account not yet created");
			          break;

			          default:
			            System.out.println(" ## Invalid choice ##");
			      }
			    }

			  }
			}
