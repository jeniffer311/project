import java.util.Scanner;
class Question{
    public static void main(String args[]){
        String name="jeni";
        Scanner scanner=new Scanner(System.in);
        String name2;
        do{
            System.out.println("Enter the name : ");
            name2=scanner.nextLine();   
        }
        while(!(name.equals(name2)));   
    }
}