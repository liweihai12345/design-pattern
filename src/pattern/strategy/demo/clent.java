package pattern.strategy.demo;

public class clent {

	public static void main(String[] args) {
		StrategyForPlan aplan= new APlan();
		StrategyForPlan bplan= new BPlan();
		StrategyForPlan cplan= new CPlan();
		// ִ��A�ƻ�
		ContextPlan realplan =new ContextPlan(aplan);
		// Χ���ж���ʼ��ִ��A�ƻ�
		System.out.println("Χ���ж���ʼ��ִ��A�ƻ�");
		realplan.actionPlan();
		realplan =new ContextPlan(bplan);
		// Χ���ж�ִ��B�ƻ�
		
		System.out.println("����б�ִ��B�ƻ�");
		realplan.actionPlan();
		// ִ��C�ƻ�

		realplan =new ContextPlan(cplan);
		System.out.println("ͻȻ�����������Ҫִ��C�ƻ�");
		realplan.actionPlan();
		
		System.out.println("���ս����������Ż����");
	}

}
