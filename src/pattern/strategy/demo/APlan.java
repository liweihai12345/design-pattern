package pattern.strategy.demo;

/**
 * 具体A计划
 * @author liweihai
 *
 */
public class APlan extends StrategyForPlan{

	@Override
	public void plan() {
		System.out.println("执行A计划");
		
	}

}
