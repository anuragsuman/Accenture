
class A11
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}
class B11 extends A11
{
    void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
}

public class brillio5 {

    public static void main(String[] args) {
        A11 a=new B11();
        a.m1();
    }
}

