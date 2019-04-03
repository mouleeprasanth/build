import java.util.*;
class Exercise6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input floating-point number:");
double firstnum=sc.nextDouble();
System.out.print("Input floating-point another number:");
double secondnum=sc.nextDouble();
firstnum=Math.round(firstnum*1000);
firstnum=firstnum/1000;
secondnum=Math.round(secondnum*1000);
secondnum=secondnum/1000;
if(firstnum==secondnum)
{
System.out.println("They are the same upto three decimal places");
}
else
{
System.out.println("They are different");
}


}
}
