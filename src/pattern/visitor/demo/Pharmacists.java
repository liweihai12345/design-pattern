package pattern.visitor.demo;
/**
 *  药剂师 负责取药品
 * @author liweihai
 *
 */
public class Pharmacists implements IVisitor{

	@Override
	public void doVisit(MedicineA a) {
		System.out.println("药剂师拿药品："+a.getName()+" 给取药人");
		
	}

	@Override
	public void doVisit(MedicineB b) {
		System.out.println("药剂师拿药品："+b.getName()+" 给取药人");
		
	}

}
