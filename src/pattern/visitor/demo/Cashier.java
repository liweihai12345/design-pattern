package pattern.visitor.demo;

/**
 * ����Ա �����ҩƷ�տ�
 * @author liweihai
 *
 */
public class Cashier implements IVisitor{

	@Override
	public void doVisit(MedicineA a) {
		System.out.println("������ҩƷ��"+a.getName()+" �տ"+a.getPrice());
		
	}

	@Override
	public void doVisit(MedicineB b) {
		System.out.println("����Ա��ҩƷ��"+b.getName()+" �տ"+b.getPrice());
		
	}
	

}
