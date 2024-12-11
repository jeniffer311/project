class Leap{
    public static void main(String args[]){
        int year=2023;
        int century=100;
        if(year%4==0)
          System.out.println("It is a leap year");
        else 
          System.out.println("It is not a leap year");
        if(century%400==0)
          System.out.println("It is a leap century");
        else
          System .out.println("It is not a leap century");
    }
}