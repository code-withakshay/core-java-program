
class Main
{
	public static void main(String[] args)
	{
		String s1=new String("Akshay");

		String s2=s1.intern();
		
		String s3="Akshay";
		
		// Objects Address Find Method
        int addressObj1 = System.identityHashCode(s2);
        int addressObj2 = System.identityHashCode(s3);
		
		//Print object Address
		System.out.println("Approximate memory address of obj1: " + Integer.toHexString(addressObj1));
        System.out.println("Approximate memory address of obj2: " + Integer.toHexString(addressObj2));
		
		//Compare Two objects use '==' Method.
		System.out.println((s2==s3));
    }		
}