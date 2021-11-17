public class DuDemo
{
public static void main(String [] args)
{
String g[] = {"vishnu","siva","vishnu","chitu","chitu"};
String c[] = new String[g.length];
int x = 0;
int y = 0;

for(int i = 0; i < (g.length)-1; i++)
	{
	for(int j=1; j < g.length; j++)
		{
		if(c[i]==c[j])
		   {
		    String g1 = c[j];
		    String dg[x] = g1;
		    x += x;
		   }
		   else
		   {
		    String g2 = c[i];
		    String nd[y] = g2;
		    y += y;
		   }
		}
	}
System.out.println("No Duplicate: " +nd);
System.out.println("Duplicate: " +dg);
}