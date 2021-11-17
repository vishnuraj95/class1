import java.util.Arrays;
public class Duplicates
{
public static void main(String [] args)
{
String a[] = {"is","the","some","thing","the"};
Arrays.sort(a);

String re[]= new String[a.length];
String pre= a[0];  // pre=abu
re[0]=pre;  // re[0]= abu

for(int i=1;i<a.length;i++)
{

String ch = a[i];  // ch=siva , ch= vishnu, 
if(pre!=ch)  // abu=siva, siva= vishnu
{
re[i]=ch;   // re[1]=siva, re[2]= vishnu
}
pre = ch;   // pre= siva, pre= vishnu
}
for(String j : re)
{
System.out.println(j);	
}
}
}

