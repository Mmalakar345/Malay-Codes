// Write a java program to show a student data set using static member.
package OppS;

public class StaticMember {
	int roll;
	String name;
	static String Cname = "SVIST"; // this is not a part of object. 
	StaticMember(int x,String y) // Parametarized constructer.
	{
		roll = x;
		name = y;
	}
	void display()
	{
		System.out.println("Roll "+roll+" -- Name "+name+" -- College Name "+Cname);
	}
	
	public static void main(String args []) {
		StaticMember aa = new StaticMember(101,"Malay");
		StaticMember bb = new StaticMember(102,"Satyabhama");
		StaticMember cc = new StaticMember(102,"Samadrita");
		aa.display();
		bb.display();
		cc.display();
	}

}// class end.
