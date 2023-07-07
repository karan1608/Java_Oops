public class Super {

    public void base(){
        System.out.println("Hello Karan");
    }
}
class dd extends Super{
    public void derived1(){
        super.base();
        System.out.println("Hello Vish");
    }

}
class inheritance1 {
    public static void main(String[] args) {
        dd obj1 = new dd();
        obj1.derived1(); //calling derived class
    }
}

