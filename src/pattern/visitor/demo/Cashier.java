package pattern.visitor.demo;

/**
 * 收银员 负责给药品收款
 * @author liweihai
 *
 */
public class Cashier implements IVisitor{

	@Override
	public void doVisit(MedicineA a) {
		System.out.println("收银给药品："+a.getName()+" 收款："+a.getPrice());
		
	}

	@Override
	public void doVisit(MedicineB b) {
		System.out.println("收银员给药品："+b.getName()+" 收款："+b.getPrice());
		
	}
	

}
