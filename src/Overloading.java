class Overloading1 {
    int subtract(int a,int b)
    {
        return a-b;
    }
}
class derived extends Overloading1{
    int subtract(int a, int b,int c)
    {
        return (a-b)-c;
    }
}
class Overloading{
    public static void main(String[] args) {
        derived d = new derived();
        System.out.println(d.subtract(1,2));
        System.out.println(d.subtract(1,2,3));
    }
}
