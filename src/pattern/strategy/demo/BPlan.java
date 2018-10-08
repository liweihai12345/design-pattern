package pattern.strategy.demo;

/**
 * B策略具体实现类
 * @author liweihai
 *
 */
public class BPlan extends StrategyForPlan {

	@Override
	public void plan() {
		System.out.println("执行B计划");
		
	}

}
