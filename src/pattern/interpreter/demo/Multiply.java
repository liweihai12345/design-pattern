package pattern.interpreter.demo;
/**
 * 乘法运算 (非终结符表达式)
 * @author liweihai
 *
 */
public class Multiply implements ArithmerticExpression{

	ArithmerticExpression left;
	ArithmerticExpression right;
	
	public Multiply(ArithmerticExpression left, ArithmerticExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		
		return left.interpret(variables)*right.interpret(variables);
	}

}
