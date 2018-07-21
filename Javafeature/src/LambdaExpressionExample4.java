@FunctionalInterface 
interface Sayable 
{
	public String say(String name);
}
public class LambdaExpressionExample4
{
	public static void main(String[] args) 
	{
		Sayable s=(name)->{
			return "Hello:"+name;
		};
		System.out.println(s.say("Kiran"));
		Sayable s1=(name)->{
			return "Hello:"+name;
		};
		System.out.println(s1.say("Rathod"));
	}
}
