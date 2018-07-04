package pattern.visitor.demo;
/**
 * ����ҩƷ�� A
 * @author liweihai
 *
 */
public class MedicineA extends Medicine{

	public MedicineA(String name, Double price) {
		super(name, price);
		
	}

	//��ҩƷ����
	@Override
	public void accept(IVisitor visitor) {
		visitor.doVisit(this);
	}
	

}
