import java.util.*;
class MinsintoYears{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of minutes:");
int minutes=sc.nextInt();
int year=minutes/525600;
int day=minutes/1440;
int remainingminutes=day%525600;
System.out.println(minutes+" minutes is "+year+" years and "+remainingminutes+" days");
}
}
