public class DuplicatesDemo
{
public static void main(String [] args)
{
String g[] = {"vishnu","siva","vishnu","chitu","chitu"};
String c[] = new String[g.length];
int x = 0;
int y = 0;
String dg[] = {""};
String nd[] = {""};

for(int i = 0; i < g.length; i++)
	{
	for(int j=i+1; j < g.length; j++)
		{
		if(g[i]==g[j])
		   {
		    String g1 = g[j];
		    dg[x] = g1;
		    x = x++;
		   }
		   else
		   {
		    String g2 = g[i];
		    nd[y] = g2;
		    y = y++;
		   }
		}
	}
for(String ab : nd)
{
System.out.println("No Duplicate: " +nd);
}
for(String ba : dg)
{
System.out.println("Duplicate: " +dg);
}
}
}
