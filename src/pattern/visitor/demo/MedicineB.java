package pattern.visitor.demo;
/**
 * ����ҩƷ�� B
 * @author liweihai
 *
 */
public class MedicineB extends Medicine{

	public MedicineB(String name, Double price) {
		super(name, price);
	}

	// ��ҩƷ����
	@Override
	public void accept(IVisitor visitor) {
		visitor.doVisit(this);
		
	}

}
