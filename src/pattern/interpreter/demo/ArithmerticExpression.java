package pattern.interpreter.demo;

/**
 * 抽象表达式角色
 * @author liweihai
 *
 */
public interface ArithmerticExpression {

	int interpret(Variables variables);
}
