import java.util.Scanner;
class Average{
    public static void main(String args[]){
        int n=3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three inputs : ");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        System.out.println((n1+n2+n3)/n);
    }
}