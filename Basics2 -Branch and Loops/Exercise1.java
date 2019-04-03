import java.util.*;
class Exercise1{
public static void main(String[] args){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Input Number:");
n=sc.nextInt();
if(n<0){
System.out.println("Number is negative");
}
else if(n>0){
System.out.println("Number is positive");
}
else{
System.out.println("Number is neither positive nor negative");
}
}
}
