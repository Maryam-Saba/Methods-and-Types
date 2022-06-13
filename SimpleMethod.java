class Add
{
int a;
int b;
void add()
{
System.out.println(a+b);
}
}
public class SimpleMethod

{
public	static 	void 	main(String ars[])
{
Add values= new Add();
values.a=50;
values.b=60;
values.add();
}
}