public class Adnt
{
int a[] = {1,2,3,4,5};
int b = 0;
public void numb()
{

for (int i =0;i<a.length; i++)
{
b=b+a[i];
}
//System.out.println(b);
}

public static void main(String [] args)
{
Adnt a1 = new Adnt();
a1.numb();
System.out.println(a1.b);
}

}