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
		Caaa obj1=new Caaa();             //(b)Caaa()�Q�I�s
		Caaa obj2=new Caaa(12);           //(b)Caaa(int i)�Q�I�s
	}

}
//(c)���i�H�A�]�������O�غc��
//(d)�_�A���b�P�@��class��