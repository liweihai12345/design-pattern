package pattern.interator;

import java.util.Vector;

/**
 * ����ۼ�ʵ����
 * @author liweihai
 *
 */
public class ConcreteAggregate implements Aggregate {
	private Vector<Object> vector= new Vector<>();// ����


	//	���Ԫ��
	@Override
	public void add(Object obj) {
		this.vector.add(obj);
	}

	//����������
	@Override
	public Iterator creatIterator() {
		
		
		return new ConcreteIterator(this);
	}
	// huoȡԪ��
	public Object getElement(int index){
		if(index<vector.size()){
			return vector.get(index);
		}
		return null;
	}
	public int size(){
		return vector.size();
	}
	

}
