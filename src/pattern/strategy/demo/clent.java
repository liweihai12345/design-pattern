package pattern.strategy.demo;

public class clent {

	public static void main(String[] args) {
		StrategyForPlan aplan= new APlan();
		StrategyForPlan bplan= new BPlan();
		StrategyForPlan cplan= new CPlan();
		// 执行A计划
		ContextPlan realplan =new ContextPlan(aplan);
		// 围剿行动开始先执行A计划
		System.out.println("围剿行动开始先执行A计划");
		realplan.actionPlan();
		realplan =new ContextPlan(bplan);
		// 围剿行动执行B计划
		
		System.out.println("情况有变执行B计划");
		realplan.actionPlan();
		// 执行C计划

		realplan =new ContextPlan(cplan);
		System.out.println("突然意外情况，需要执行C计划");
		realplan.actionPlan();
		
		System.out.println("最终将整个贩毒团伙剿灭。");
	}

}
