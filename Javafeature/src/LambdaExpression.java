interface Base {
	public void show();
}
public class  LambdaExpression{
	public static void main(String[] args) {
		 int width=10;
		 Base b=new Base(){
		 public void show(){
		System.out.println("Outpu:"+width);
		 }
		};
		b.show();
	}
}
