package pointinXmlApproach.business;

import pointinXmlApproach.exception.AcnoNotFoundException;

public class Bank {

	int amt = 5000;
	String acno = "SBI123";
	public int deposite (String acno,int amt){
		if(acno.equals(this.acno)){
			System.out.println("in deposite method");
			this.amt = this.amt+amt;
			return this.amt;
		}
		else{
			throw new AcnoNotFoundException();
		}
	}
	public int findbalance(String acno){
		if(acno.equals(this.acno)){
			return amt;
		}else{
		throw new AcnoNotFoundException();
	}
	}
	
}
