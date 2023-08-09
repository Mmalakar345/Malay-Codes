package OppS;

public class StaticFunction {
	int roll;
	String name;
	static String Cname = "SVIST"; // this is not a part of object & static member also. 
	StaticFunction(int x,String y) // parametarized constructer
	{
		roll = x;
		name = y;
	}
	void display()
	{
		System.out.println("Roll "+roll+" -- Name "+name+" -- College Name "+Cname);
	}
	
	static void Change(){  // static member function
		Cname="S University";
	}
	public static void main(String args []) {
		StaticFunction aa = new StaticFunction(101,"Malay");
		StaticFunction bb = new StaticFunction(102,"Satyabhama");
		StaticFunction cc = new StaticFunction(102,"Samadrita");
		aa.display();
		bb.display();
		// When change function call then the static variavle change also.
		StaticFunction.Change();
		cc.display();
	}

}
