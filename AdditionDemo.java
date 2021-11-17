public class AdditionDemo extends ArithmeticDemo
{


/*public void add()
{
super();
System.out.println("Sum of CHild class variables : "+var1);
}
*/

public static void main(String[] args)
{
//AdditionDemo a = new AdditionDemo();
//ArithmeticDemo a = new ArithmeticDemo();
ArithmeticDemo a = new AdditionDemo();   //upcasting
a.add();
}
}
