class Ladder{
    public static void main(String args[]){
        int choice=5;
        int a=3;
        int b=9;
        if(choice==1)
            System.out.println(a+b);
        else if(choice==2)
            System.out.println(a-b);
        else if(choice==3)
            System.out.println(a*b);
        else if(choice==4)
            System.out.println(a/b);
        else
            System.out.println("Invalid");
    }
}