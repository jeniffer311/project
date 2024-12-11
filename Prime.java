class Prime{
    public static void main(String args[]){
        int num=18;
        int count=0;
        if(num==0||num==1)
           System.out.println(num+" not a Prime number");
        for(int i=2;i<=19;i++)
           if(num%i==0)
              count++; 
        if(count==1)
              System.out.println(num+" is a Prime number");
        else
              System.out.println(num+" is not a Prime number"); 
    }
}