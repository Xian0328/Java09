class Data
{
	private String name;
	private Test score;
	public Data(String str,int eng,int m)
	{
		name=str;
		score=new Test(eng,m);
	}
	class Test//(a)
	{
		public int english;//(b)
		public int math;//(b)
		public Test(int eng,int m)//(b)
		{
			english=eng;
			math=m;
		}
		double avg()
		{
			return (english+math)/2.0;//(c)
		}
		public void show_score()
		{
			System.out.println("�^�妨�Z:"+english);
			System.out.println("�ƾǦ��Z:"+math);
			System.out.println("�������Z:"+avg());
		}
	}
	public void show()//(d)
	{
		System.out.println("�ǥͩm�W:"+name);
		score.show_score();
	}
}
public class class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu=new Data("Annie",85,92);//(e)
		stu.show();
	}

}
