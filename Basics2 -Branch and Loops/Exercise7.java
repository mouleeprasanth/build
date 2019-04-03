import java.util.*;
class Exercise7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int numberofdays=0;
String monthname=" ";
System.out.print("Input a month number:");
int month =sc.nextInt();
System.out.pritn("Input a year: ");
int year=sc.nextInt();
switch(month)
{
case 1:
monthname="January";
numberofdays=31;
break;
case 2:
monthname="February";
numberofdays=31;
break;
case 3:
monthname="March";
numberofdays=31;
break;
case 4:
monthname="April";
numberofdays=30;
break;
case 5:
monthname="May";
numberofdays=31;
break;
case 6:
monthname="June";
numberofdays=30;
break;

case 7:
monthname="July";
numberofdays=31;
break;
case 8:
monthname="August";
numberofdays=31;
break;
case 9:
monthname="September";
numberofdays=30;
break;
case 10:
monthname="October";
numberofdays=31;
break;
case 11:
monthname="November";
numberofdays=30;
break;
case 1:
monthname="December";
numberofdays=31;
break;
}
System.out.println(monthname+" "+year+" has "+numberofdays+" days");
}
}
