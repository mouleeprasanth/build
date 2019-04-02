import java.util.*;
class twointegers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input 1st integer: ");
int firstint=sc.nextInt();
System.out.print("Input 2nd integer: ");
int secondint=sc.nextInt();
System.out.printf("Sum of two integers: %d%n",firstint + secondint);
System.out.printf("Difference of two integrs: %d%n",firstint - secondint);
System.out.printf("Products of two integers: %d%n",firstint * secondint);
System.out.printf("Average of two integers:%f%n",(double) (firstint + secondint)/2 );
System.out.printf("Distance of two integers:%d%n",firstint - secondint);
int min=0,max=0;
if(firstint>secondint)
{
max=firstint;
min=secondint;
}else if(secondint>firstint){
min=firstint;
max=secondint;
}else
{
System.out.println("both are equal");
System.exit(0);
}

System.out.println("Max integer:"+max);
System.out.println("Min integer:"+min);




}
}
