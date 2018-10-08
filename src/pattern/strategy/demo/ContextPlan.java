package pattern.strategy.demo;

/**
 * 主环境类
 * @author liweihai
 *
 */
public class ContextPlan {

	private StrategyForPlan strategyForPlan;
	
	
	public ContextPlan(StrategyForPlan strategyForPlan) {
		super();
		this.strategyForPlan = strategyForPlan;
	}


	// 执行策略计划
	public void actionPlan(){
		this.strategyForPlan.plan();
	}
	
	

}
