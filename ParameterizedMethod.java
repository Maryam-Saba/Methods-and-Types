class Addition
{
int a;
int b;
void add(int x, int y)
{
a=x;
b=y;
System.out.println(a+b);
}
}
public class ParameterizedMethod

{
public	static 	void 	main(String ars[])
{
Addition values= new Addition();
values.add(100,200);
}
}