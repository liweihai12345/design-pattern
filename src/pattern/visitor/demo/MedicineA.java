package pattern.visitor.demo;
/**
 * 具体药品类 A
 * @author liweihai
 *
 */
public class MedicineA extends Medicine{

	public MedicineA(String name, Double price) {
		super(name, price);
		
	}

	//对药品操作
	@Override
	public void accept(IVisitor visitor) {
		visitor.doVisit(this);
	}
	

}
