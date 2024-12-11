class Overloading{
    public static void main(String args[]){
        
        
        static void hello(){
            System.out.println();
        }
        static void hello(int a){
            System.out.println(a);
        }
        static void hello(int a,int b){
            System.out.println(a,b);
        }
        static void hello(int a,String s){
            System.out.println(a,"");
        }
    hello();
    hello(1);
    hello(1,2);
    hello(1,"hi");
    }
}