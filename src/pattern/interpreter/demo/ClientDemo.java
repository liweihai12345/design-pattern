package pattern.interpreter.demo;

public class ClientDemo {

	public static void main(String[] args) {
		Variables v =new Variables();
		Variable x=new Variable();
		Variable y=new Variable();
		Variable z=new Variable();
		v.put(x, 10);
		v.put(y, 20);
		v.put(z, 30);
		// º∆À„x*(y+z/x)-x
		ArithmerticExpression e =new Subtract(new Multiply(x,new Plus(y,new Division(z,x))),x);
		System.out.println(e.interpret(v));
		
	}
}
