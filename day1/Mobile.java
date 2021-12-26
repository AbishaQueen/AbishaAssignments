package week1.day1;

public class Mobile {
	String mobileModel="Motorola";
	int mobileWeight=300;
	boolean isFullycharged=true;
	double mobileCost=15234.9876;
	
	public void makeCall() {
		System.out.println("Make call");
	}
	public void sendMsg() {
		System.out.println("Send Message");
	}
	
	
	public static void main(String[] arg) {
		
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isFullycharged);
		System.out.println(mob.mobileCost);
		
		
	}

}
