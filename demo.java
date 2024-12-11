import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("What is you rating from 1 to 5");
        Short rating=scanner.nextShort();
        System.out.println("my rating is "+rating);
    }
}