package pattern.interator;

/**
 * 具体迭代体
 * @author liweihai
 *
 */
public class ConcreteIterator implements Iterator{

	private ConcreteAggregate agg;// 具体聚集类
	private int index=0; // 索引
	private int size=0; // 总数
	
	public ConcreteIterator(ConcreteAggregate agg) {
		super();
		this.agg = agg;
		this.index=0;
		this.size=agg.size();
	}

	// 获取下一个元素
	@Override
	public Object next() {
		if(index<size){
			return agg.getElement(index++);
		}else{
			return null;
		}
	}
	// 是否还有下一个元素
	@Override
	public boolean hasNext() {

		return index<size;
	}

}
