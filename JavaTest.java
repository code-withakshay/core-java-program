//import java.util.Scanner;
class JavaTest
{
    public static void main(String[] args) 
    {
        int num=2, cunt=0;
        while(num<=100)
        {
            boolean flag=true;
            int i=2;
            while(i<=Math.sqrt(num))
            {
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
                i++;
            }
            if(flag==true){
                System.out.print(num+" ");
                cunt++;
            }
            num++;
        }
        System.out.println();
        System.out.println(cunt);
        //num++;
    }
}