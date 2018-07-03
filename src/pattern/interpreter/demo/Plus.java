package pattern.interpreter.demo;

/**
 * 加法运算 (非终结符表达式)
 * @author liweihai
 *
 */
public class Plus implements ArithmerticExpression{

	ArithmerticExpression left;
	ArithmerticExpression right;
	
	public Plus(ArithmerticExpression left, ArithmerticExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		// TODO Auto-generated method stub
		return left.interpret(variables)+right.interpret(variables);
	}

}
