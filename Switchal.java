import java.util.Scanner;
class Switchal{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1;
        System.out.println("Enter the number");
        num1=scanner.nextInt();
        int num2;
        System.out.println("Enter the number2");
        num2=scanner.nextInt();
        char choice;
        System.out.println("Enter +,-,*");
        choice=scanner.next().charAt(1);
        switch(choice){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}