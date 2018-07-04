package pattern.visitor.demo;
/**
 * 具体药品类 B
 * @author liweihai
 *
 */
public class MedicineB extends Medicine{

	public MedicineB(String name, Double price) {
		super(name, price);
	}

	// 对药品操作
	@Override
	public void accept(IVisitor visitor) {
		visitor.doVisit(this);
		
	}

}
