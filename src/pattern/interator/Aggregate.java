package pattern.interator;

/**
 * ����ۼ���
 * @author liweihai
 *
 */
public interface Aggregate {

	// ���Ԫ��
	public void add(Object obj);
//	����������
	public Iterator creatIterator();
}
