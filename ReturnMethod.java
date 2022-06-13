class Addition
{
int a;
int b;
int Addition()
{
return a+b;
}
}
public class ReturnMethod

{
public	static 	void 	main(String ars[])
{
Addition values= new Addition();
values.a=500;
values.b=400;
values.Addition();
System.out.println(values.Addition());
}
}