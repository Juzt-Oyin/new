package week3;

import javax.swing.JOptionPane;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		//Working on Financial Application
		
		String s = JOptionPane.showInputDialog("Enter monthly saving");
		String i = JOptionPane.showInputDialog ("Enter interest rate");
		
		int save= Integer.parseInt(s);
		double rate = Double.parseDouble(i);
		double rr = (rate/100)/12;  //Monthly interest rate
		double rnd = Math.round(rr*Math.pow(10,6))
				/Math.pow(10,6); //Monthly interest rate rounded up
		
		double rrm =( rr +1)*100; //Saved value after 1 month
		double rrn =( rr +1)*(100+rrm); //Saved value after 2 month
		double rro =( rr +1)*(100+rrn); //Saved value after 3 month
		double rrp =( rr +1)*(100+rro); //Saved value after 4 month
		double rrq =( rr +1)*(100+rrp); //Saved value after 5 month
		double rrr =( rr +1)*(100+rrq); //Saved value after 6 month
		double rdr = Math.round(rrr*Math.pow(10, 2))
				/Math.pow(10, 2); //sixth rounded up value
		
		System.out.println("The monthlt saving is $" +s);
		System.out.println("The interest rate is " +i);
		System.out.println("The monthly interest rate is " + rnd);
		System.out.println("First month account value is $" + rrm);
		System.out.println("Second month account value is $" + rrn);
		System.out.println("Third month account value is $" + rro);
		System.out.println("Forth month account value is $" + rrp);
		System.out.println("Fifth month account value is $" + rrq);
		System.out.println("Sixth month account value is $" + rdr);
		
		//show message information
		JOptionPane.showMessageDialog
		(null, "Sixth month account value is $" +rdr);
		
		//Question 2: Algebra
		 double a =3.4; double b =50.2; double c = 2.1;
		 double d = .55; double e = 44.5; double f =5.9;
		 
		 double xx = (e*d- b*f)/(a*d-b*c);
		 double yy = (a*f- e*c)/(a*d-b*c);
		 
		//rounding up to 2 decimal point
		double x = Math.round(xx*Math.pow(10,2))/Math.pow(10,2);
		double y = Math.round(yy*Math.pow(10,2))/Math.pow(10,2);
		 
		 
		 System.out.println("The value of x is " +x);
		 System.out.println("The value of y is " +y);
		
		
}
}
