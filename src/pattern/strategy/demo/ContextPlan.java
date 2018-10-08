package pattern.strategy.demo;

/**
 * ��������
 * @author liweihai
 *
 */
public class ContextPlan {

	private StrategyForPlan strategyForPlan;
	
	
	public ContextPlan(StrategyForPlan strategyForPlan) {
		super();
		this.strategyForPlan = strategyForPlan;
	}


	// ִ�в��Լƻ�
	public void actionPlan(){
		this.strategyForPlan.plan();
	}
	
	

}
