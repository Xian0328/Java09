class CWin
{
	public static int cnt=0;//(a)
	public static void count()//(a)
	{
		cnt++;
	}
	public static String color;
	public static int width;
	public static int height;
	public CWin(String str,int w,int h)//(b)
	{
		color=str;
		width=w;
		height=h;
		count();
	}
	public CWin()//(c)
	{
		color="Red";
		width=2;
		height=2;
		count();
	}
	public void setZero()//(d)
	{
		cnt=0;
	}
	public void setValue(int n)//(e)
	{
		cnt=n;
	}
	public void show()
	{
		System.out.println("color="+color);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println(cnt);
	}
}
public class class08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin obj1=new CWin("Blue",5,5);
		obj1.show();
		CWin obj2=new CWin();
		obj2.show();
	}

}
//(f)類別，用實力的話可能無法取用
//(g)都可以
