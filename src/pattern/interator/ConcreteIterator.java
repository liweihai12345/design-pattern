package pattern.interator;

/**
 * ���������
 * @author liweihai
 *
 */
public class ConcreteIterator implements Iterator{

	private ConcreteAggregate agg;// ����ۼ���
	private int index=0; // ����
	private int size=0; // ����
	
	public ConcreteIterator(ConcreteAggregate agg) {
		super();
		this.agg = agg;
		this.index=0;
		this.size=agg.size();
	}

	// ��ȡ��һ��Ԫ��
	@Override
	public Object next() {
		if(index<size){
			return agg.getElement(index++);
		}else{
			return null;
		}
	}
	// �Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {

		return index<size;
	}

}
