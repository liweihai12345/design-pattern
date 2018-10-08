package pattern.interator;

import java.util.Vector;

/**
 * 具体聚集实现类
 * @author liweihai
 *
 */
public class ConcreteAggregate implements Aggregate {
	private Vector<Object> vector= new Vector<>();// 集合


	//	添加元素
	@Override
	public void add(Object obj) {
		this.vector.add(obj);
	}

	//创建迭代器
	@Override
	public Iterator creatIterator() {
		
		
		return new ConcreteIterator(this);
	}
	// huo取元素
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
