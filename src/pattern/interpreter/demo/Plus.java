package pattern.interpreter.demo;

/**
 * �ӷ����� (���ս�����ʽ)
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
