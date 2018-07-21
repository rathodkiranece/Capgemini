interface Sayable
{
	public String say();
}
public class LambdaExpressionExample3
{
	public static void main(String[] args) 
	{
		Sayable s=()->{
			return "I have Nothing to say";
		};

		System.out.println(s.say());
	}
}
