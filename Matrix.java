class Matrix{
    public static void main(String args[]){
        int a[][]={{3,2,4},{4,5,6}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }   
    }
}