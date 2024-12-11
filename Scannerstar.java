import java.util.Scanner;
class Scannerstar{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many stars do u have to print?");
        int s=scanner.nextInt();
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}