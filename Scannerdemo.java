import java.util.Scanner;
class Scannerdemo{
    public static void main(String args[]){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter username");
        String name=myObj.nextLine();
        System.out.println("The greatest women is "+name);
    }
}