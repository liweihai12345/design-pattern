package pattern.interpreter;

/**
 * 抽象表达式
 * @author liweihai
 *
 */
public abstract class AbstractExpression {
	// 每一个表达式必须有一个解析任务
	public abstract Object interpreter(Context cxt);

}
