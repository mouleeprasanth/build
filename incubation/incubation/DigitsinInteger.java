import java.util.*;
class DigitsinInteger{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input an integer between 0 and 1000:");
int number=sc.nextInt();
int firstdigit=number%10;
int remainingnumber=number/10;
int seconddigit=remainingnumber%10;
remainingnumber=remainingnumber/10;
int thirddigit=remainingnumber%10;
remainingnumber=remainingnumber/10;
int fourthdigit=remainingnumber%10;
int sum= firstdigit + seconddigit + thirddigit + fourthdigit;
System.out.println("The sum of all digits in "+number+" is "+sum);


}
}
