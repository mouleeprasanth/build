import java.util.*;
class distance{
public static void main(String[] args){
double timeseconds;
double mps,kph,mph;
Scanner sc=new Scanner(System.in);
System.out.print("Input distance in meters:");
double distance=sc.nextDouble();
System.out.print("Input hour:");
double hour=sc.nextDouble();
System.out.print("Input minutes:");
double mins=sc.nextDouble();
System.out.print("Input seconds:");
double secs=sc.nextDouble();
timeseconds=(hour*3600)+(mins*60)+secs;
mps=distance/timeseconds;
kph=(distance/1000)/(timeseconds/3600);
mph=kph/1.609;
System.out.println("Your speed in meters/second is "+mps);
System.out.println("Your speed in km/h is "+kph);
System.out.println("Your speed in miles/h is "+mph);
}
}
