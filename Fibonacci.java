class Fibonacci{
    public static void main(String args[]){
        int i=1,num1=0,num2=1,sum;
        while(i<=10){
             System.out.println(num1);
             sum=num1+num2;
             num1=num2;
             num2=sum;
             i++;
            }
        }
}
