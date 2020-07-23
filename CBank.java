package OOPTest;

import java.io.*;
class Bank1{
	static double amt;
	Bank1(double amt){
		this.amt=amt;
	}
}
class CBank extends Bank1 implements BankFunction{
	public static void main(String[] arg) {
		CBank c=new CBank(1000.0);
		c.Inc(100);
		System.out.println(c.amt);
		c.Dec(100);
		System.out.println(c.amt);
		
		
				
		
		
		
	}

	CBank(double amt) {
		super(amt);
		
	}

	
	public void Inc(double amt) {
		this.amt+=amt;
		
	}

	
	public void Dec(double amt) {
		this.amt-=amt;
		
	}
	
}

interface BankFunction{
	public void Inc(double amt);
	public void  Dec(double amt);
	
	
}






