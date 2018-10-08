package pattern.strategy;

/**
 * 环境角色类
 * @author liweihai
 *
 */
public class Context {
	private Strategy strategy= null;
	public Context(Strategy  strategy){
		this.strategy=strategy;
	}
	// 调用策略方法
	public void contextInterface(){
		this.strategy.strategyInterface();
	}

}
