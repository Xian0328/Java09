class add2n
{
	int a=0;
	public add2n(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			a+=i;
			//System.out.print(i);
		}
		System.out.println(a);
	}
}
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add2n obj=new add2n(5);
		add2n obj1=new add2n(10);
	}

}
