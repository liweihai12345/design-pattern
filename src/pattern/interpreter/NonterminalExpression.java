package pattern.interpreter;

/**
 * 非终结符表达式
 * @author liweihai
 *
 */
public class NonterminalExpression extends AbstractExpression{

	// 每个非终结符表达式都会对其他表达式产生依赖
	public NonterminalExpression() {
	}

	@Override
	public Object interpreter(Context cxt) {
		//进行文法处理
		return null;
	}

}
