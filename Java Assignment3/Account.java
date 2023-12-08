import java.util.Date;
import java.util.Scanner;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account () {
		this(0,0);
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
        this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	//monthly interest rate
	public double getMonthlyInterestRate() {
		
		return (annualInterestRate/12);	
	}
	//monthly interest
	public double getMonthlyInterest() {
		
		return (balance *(annualInterestRate/12)/100);
	}
	//withdrawal method
	public void withdraw (double xx) {
		if (xx > 0 && xx <= balance) {
			balance -= xx;
			 System.out.println("Withdrawal successful. Current balance: $" + balance);
		} else {
			System.out.println("Insufficient amount");
		}
	}
	//deposit method
		public void deposit (double xxx) {
		if (xxx > 0 && xxx <= balance) {
			balance += xxx;
			 System.out.println("Deposit successful. Current balance: $" + balance);
		} else {
			System.out.println("Insufficient amount");
		}
	}
		
		
}
