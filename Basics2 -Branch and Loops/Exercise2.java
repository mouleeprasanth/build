import java.util.*;
class Exercise2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input a:");
double a=sc.nextDouble();
System.out.print("Input b:");
double b=sc.nextDouble();
System.out.print("Input c:");
double c=sc.nextDouble();

double result= (b*b)-(4*a*c);
if(result>0){
double root1=(-b +Math.pow(result,0.5))/(2*a);
double root2=(-b -Math.pow(result,0.5))/(2*a);
System.out.println("The roots are "+root1+" and "+root2);
}else if(result==0){
double root1=-b/(2*a);
System.out.println("The root is "+root1);
}else{
System.out.println("The equation has no real roots.");
} 
}
}
