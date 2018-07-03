package pattern.interpreter.demo;
/**
 * �������� (���ս�����ʽ)
 * @author liweihai
 *
 */
public class Subtract implements ArithmerticExpression {

	ArithmerticExpression left;
	ArithmerticExpression right;
	
	public Subtract(ArithmerticExpression left, ArithmerticExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		return left.interpret(variables)- right.interpret(variables);
	}

}
