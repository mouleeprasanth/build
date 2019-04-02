import java.util.*;
class FtoCconversion{
public static void main(String[] args){
double fahrenheit;
Scanner sc=new Scanner(System.in);
System.out.print("Input a degree in Fahrenheit:");
fahrenheit= sc.nextDouble();
double celsius=((fahrenheit-32)*5)/9;
System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+"in celsius");

}
}
