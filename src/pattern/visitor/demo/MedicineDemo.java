package pattern.visitor.demo;

/**
 * ������
 * @author liweihai
 *
 */
public class MedicineDemo {

	public static void main(String[] args) {
		MedicineList list =new MedicineList();
		Cashier cashier= new Cashier();// ����Ա
		Pharmacists pharmacists= new Pharmacists();// ҩ��ʦ
		list.accept(cashier);
		System.out.println("===============");
		list.accept(pharmacists);
	}
}
