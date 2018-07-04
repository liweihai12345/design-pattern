package pattern.visitor.demo;
/**
 * 取药单
 * @author liweihai
 *
 */
public class MedicineList {

	private MedicineA a;
	private MedicineB b;
	public MedicineList() {
		super();
		this.a= new MedicineA("板蓝根",8.8);
		this.b= new MedicineB("白加黑",12.6);
	}
	
	public void accept(IVisitor visitor){
		
		this.a.accept(visitor);
		this.b.accept(visitor);
	}
}
