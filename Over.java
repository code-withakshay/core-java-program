class Player
{
	int id;
	String name;
	
}
class Over
{
   public static void main(String[] args) 
   {
       //Test t=new Test();
	   Player pl=m1(18);
	   
	   System.out.println(pl.id+" "+pl.name);
   }
   static Player m1(int id)
   {
	   Player p=new Player();
	   if(id==45)
	   {
		   p.id=45;
		   p.name="VKSU";
		   
	   }
	   else if(id==18)
	   {
		   p.id=18;
		   p.name="JNU";
		  
	   }
	   return p;
   }
}