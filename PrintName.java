
import myPackage.MyClass;

public class PrintName 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "Akshay kumar";
      
      // Creating an instance of class MyClass in 
      // the package.
      PrintName obj = new PrintName();
      
      obj.getNames(name);
   }
}