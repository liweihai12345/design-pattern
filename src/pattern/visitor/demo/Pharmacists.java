package pattern.visitor.demo;
/**
 *  ҩ��ʦ ����ȡҩƷ
 * @author liweihai
 *
 */
public class Pharmacists implements IVisitor{

	@Override
	public void doVisit(MedicineA a) {
		System.out.println("ҩ��ʦ��ҩƷ��"+a.getName()+" ��ȡҩ��");
		
	}

	@Override
	public void doVisit(MedicineB b) {
		System.out.println("ҩ��ʦ��ҩƷ��"+b.getName()+" ��ȡҩ��");
		
	}

}
