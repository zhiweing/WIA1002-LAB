package l3q1;
import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
       int num1,num2,result;
       char operand;
        System.out.println("Enter first integer:");
        num1=x.nextInt();
        System.out.println("Enter second integer:");
        num2=x.nextInt();
        System.out.println("Enter the operand: [1]+ [2]- [3]* [4]/ [5]%");
        operand=x.next().charAt(0);
        switch (operand) {
            case '+':
                result=num1+num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;
            case '*':
                 result=num1*num2;
                System.out.println(num1+" * "+num2+" = "+ result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(num1+" / "+ num2+" = "+result);
                break;
            case'%':
                 result=num1%num2;
                 System.out.println(num1+" % "+ num2+" = "+result);
                 break;
            default:
                System.out.println("Invalid operation.Please enter +,-,*,/,%");
        }
      
    }
    
}
