package pattern.visitor.demo;

/**
 * 测试类
 * @author liweihai
 *
 */
public class MedicineDemo {

	public static void main(String[] args) {
		MedicineList list =new MedicineList();
		Cashier cashier= new Cashier();// 收银员
		Pharmacists pharmacists= new Pharmacists();// 药剂师
		list.accept(cashier);
		System.out.println("===============");
		list.accept(pharmacists);
	}
}
