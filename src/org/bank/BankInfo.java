package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
System.out.println("savings account no: 10776278662");
	}
	private void fixed() {
System.out.println("fixed account no: 82478491278");
	}
public static void main(String[] args) {
	BankInfo b=new BankInfo();
	b.savings();
	b.fixed();
	b.current();
	
}
}
