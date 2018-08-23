import inhe.*;
public class Fabuluos extends Fantastic
{
	 String mamname="karthikadevi";
		String branch1="CSE2014";
		String subject="oops in java";
		
	public void activities()
	{
		super.activities();  //using super keyword
		System.out.println("teaching");
	}
	

	public static void main(String[] args) {
		System.out.println("the staff extends from the student:\t");
		Fabuluos obj=new Fabuluos();     //creating object for current class
	System.out.println(	obj.getname());  //inherited from the base class
	System.out.println(obj.getbranch());
	System.out.println(	obj.gethobby());
	System.out.println(	obj.getmarks());
	System.out.println(	obj.getage());
	obj. activities();
	
			}
	
	
	}
	
				
		// TODO Auto-generated method stub
		
