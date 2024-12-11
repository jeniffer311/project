class Cat{
    String name;
    int age;
    Cat(){
        name="unknown";
        age=0;
    }
    public static void main(String args[]){
        Cat c=new Cat();
        System.out.println(c.name);
        System.out.println(c.age);
    }
}