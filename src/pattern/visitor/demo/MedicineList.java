package pattern.visitor.demo;
/**
 * ȡҩ��
 * @author liweihai
 *
 */
public class MedicineList {

	private MedicineA a;
	private MedicineB b;
	public MedicineList() {
		super();
		this.a= new MedicineA("������",8.8);
		this.b= new MedicineB("�׼Ӻ�",12.6);
	}
	
	public void accept(IVisitor visitor){
		
		this.a.accept(visitor);
		this.b.accept(visitor);
	}
}
