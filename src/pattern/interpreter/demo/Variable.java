package pattern.interpreter.demo;

/**
 * �������ʽ�еı��� ���ս�����ʽ��
 * @author liweihai
 *
 */
public class Variable implements ArithmerticExpression{

	@Override
	public int interpret(Variables variables) {
		
		return variables.get(this);
	}

}
