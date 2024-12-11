class Armstrong{
    public static void main(String args[]){
        int num=15;
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=rem*rem*rem;
            num=num/10;
        }
        System.out.println(temp);
    }
}