package pattern.interator;

/**
 * 抽象聚集类
 * @author liweihai
 *
 */
public interface Aggregate {

	// 添加元素
	public void add(Object obj);
//	创建迭代器
	public Iterator creatIterator();
}
