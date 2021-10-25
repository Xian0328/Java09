class CRectangle
{
	int width;
	int height;
	public CRectangle(int w,int h)  //(a)
	{
		width=w;
		height=h;
	}
	public CRectangle()    //(b)
	{
		width=10;
		height=8;
	}
	void show()
	{
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
}
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle obj=new CRectangle(10,8);
		obj.show();
	}
}