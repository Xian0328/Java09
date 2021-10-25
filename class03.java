class Caaa
{
	private int value;
	
	public Caaa()
	{
		this.value=10;   //(a)
		System.out.println("value"+value);
	}
	public Caaa(int i)
	{
		value=i;
		System.out.println("value="+value);
	}
}
public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1=new Caaa();             //(b)Caaa()被呼叫
		Caaa obj2=new Caaa(12);           //(b)Caaa(int i)被呼叫
	}

}
//(c)不可以，因為它不是建構元
//(d)否，都在同一個class裡