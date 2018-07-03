package pattern.interpreter.demo;

/**
 * 算术表达式中的变量 （终结符表达式）
 * @author liweihai
 *
 */
public class Variable implements ArithmerticExpression{

	@Override
	public int interpret(Variables variables) {
		
		return variables.get(this);
	}

}
