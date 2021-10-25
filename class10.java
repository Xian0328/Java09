class CRational
{
	public int n;
	public int d;
	public void setN(int num) //設定分子
	{
		n=num;
	}
	public void setD(int num)  //設定分母
	{
		d=num;
	}
	public void setND(int num,int den)//(a)
	{
		n=num;
		d=den;
	}
	public void show()
	{
		System.out.println(n+"/"+d);
	}
}
public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa=new CRational();
		aaa.setN(2);
		aaa.setD(5);
		aaa.setND(2, 5);
		aaa.show();
	}

}
