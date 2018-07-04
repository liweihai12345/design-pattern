package pattern.visitor.demo;

/**
 * 抽象访问者
 * @author liweihai
 *
 */
public interface IVisitor {

	// 对药品进行操作（各种操作）
	public void doVisit(MedicineA a);
	
	public void doVisit(MedicineB b);
}
