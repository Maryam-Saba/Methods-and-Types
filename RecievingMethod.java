class Addition
{
int x;
int y;
int Addition(int a, int b)
{
x=a;
y=b;
return x+y;
}
}
public class RecievingMethod
{
public static void main(String args[])
{
Addition P= new Addition();
int D= P.Addition(20,30);
System.out.println(D);
}
}