class CCount
{
	public static int cnt=0;//(a)
	public static void ccount()//(a)
	{
		cnt++;
	}
	public void setZero()//(b)
	{
		cnt=0;
	}
	public void setValue(int n)//(c)
	{
		cnt=n;
	}
	public void show()
	{
		System.out.println(cnt);
	}
}
public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount obj=new CCount();
		obj.ccount();
		obj.show();
		obj.setZero();
		obj.show();
		obj.setValue(5);
		obj.show();
	}

}
//(d)都可以
//(d)都可以
