package banking_system;

import java.util.Scanner;  
class BankDetails {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
//    public void deposit() {  
//        long amt;  
//        System.out.println("Enter the amount you want to deposit: ");  
//        amt = sc.nextLong(); 
//        try {
//        	if(amt<0) {
//        		throw new ArithematicException("Insufficient amount to add");
//        	}
//        	balance = balance + amt; 
//        	System.out.println("Balance after withdrawal: " + balance); 
//        	
//        }
//        catch(ArithematicException e) {
//        	System.out.println("Exception   "+e.getMessage());
//        }
//         
//    } 
    
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
    	  System.out.println("Enter the amount you want to withdraw: ");  
        long amt=sc.nextLong();  
        try {
        	if(balance<amt) {
        		throw new ArithematicException("Insufficient balance");
        	}
        	balance = balance-amt;
        	System.out.println("Balance after withdrawal: " + balance); 
        	
        }
        catch(ArithematicException e) {
        	System.out.println("Exception   "+e.getMessage());
        }
       
    }  
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
