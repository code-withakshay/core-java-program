class Inst
{
	static String s="Akshay";

	public static void main(String[] args)
	{
		System.out.println(s); // null 
		
		Inst t=new Inst();
		System.out.println(t.s); // null 
			
		System.out.println(Inst.s); // null	
	}
}
