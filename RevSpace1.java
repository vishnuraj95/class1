import java.util.Arrays.*;

public class RevSpace1
{
public static void main(String [] args)
{
String a = "i am studying in Oranium Tech";
String rev ="";
String spa = "";
int l = a.length();

for(int i = l; i>0;i--)
{
//System.out.print(a.charAt(i-1));
spa = Arrays.toString(a.charAt(i-1));
if(spa =="")
System.out.print("h ");

//rev = rev + a[i];
}
System.out.print(rev);
}
}
