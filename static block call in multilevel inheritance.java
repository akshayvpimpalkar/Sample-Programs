class base
{
	static
	{
		System.out.println("in base static");
	}
	base(){
		System.out.println("In base const");
	}
}
class sub extends base
{
	static
	{
		System.out.println("in sub static");
	}
	sub(){
		System.out.println("In sub const");
	}
}
public class Main extends sub
{
	static
	{
		System.out.println("in Main static");
	}
	Main(){
		System.out.println("In main const");
	}
	public static void main(String args[])
	{
		Main m = new Main();
	}
}

/*
o/p:

in base static
in sub static
in Main static
In base const
In sub const
In main const
*/
