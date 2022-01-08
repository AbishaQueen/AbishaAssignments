package sutudent.info;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID : "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID : "+id+" Name :"+name);
	}
	public void getStudentInfo(String email,String phonenumber)
	{
		System.out.println("Student email : "+email+" Phonenumber :"+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Students studs=new Students();
      studs.getStudentInfo(18881,"Abisha");
      studs.getStudentInfo(1234);
      studs.getStudentInfo("Test@gmail.com","981234567");
	}

}
