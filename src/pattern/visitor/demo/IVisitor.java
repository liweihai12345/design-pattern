package pattern.visitor.demo;

/**
 * ���������
 * @author liweihai
 *
 */
public interface IVisitor {

	// ��ҩƷ���в��������ֲ�����
	public void doVisit(MedicineA a);
	
	public void doVisit(MedicineB b);
}
