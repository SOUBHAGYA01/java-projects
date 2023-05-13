 package drdo1;
/* * @author soubhagya */
import java.util.Scanner;
public class Drdo1 {
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum=add(num1,num2);
        System.out.println("The summm of " + num1 + " and " + num2 +" is: " +sum );
        sc.close();
    }     
}     
