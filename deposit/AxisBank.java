package bank.deposit;

public class AxisBank {
	public void deposit()
	{
		System.out.println("AxisBank-deposit");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AxisBank bank= new AxisBank();
     bank.deposit();
     BankInfo banki=new BankInfo();
     banki.deposit();
	}

}
