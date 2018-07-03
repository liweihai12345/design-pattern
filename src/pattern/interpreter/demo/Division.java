package pattern.interpreter.demo;
/**
 * 除法运算 (非终结符表达式)
 * @author liweihai
 *
 */
public class Division implements ArithmerticExpression {
	ArithmerticExpression left;
	ArithmerticExpression right;
	

	public Division(ArithmerticExpression left, ArithmerticExpression right) {
		super();
		this.left = left;
		this.right = right;
	}


	@Override
	public int interpret(Variables variables) {
		
		return left.interpret(variables)/right.interpret(variables);
	}

}
