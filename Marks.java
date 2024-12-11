class Marks{
    public static void main(String args[]){
        int marks=8;
        if(marks>=90)
           System.out.println("A+");
        else if(marks>=80 && marks<90)
           System.out.println("A");
        else if(marks>=70 && marks<80)
           System.out.println("B+");
        else if(marks>=60 && marks<70)
           System.out.println("B");
        else if(marks>=50 && marks<60)
           System.out.println("c+");
        else
           System.out.println("Failed");
    }
}