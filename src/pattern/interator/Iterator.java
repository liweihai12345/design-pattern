package pattern.interator;

/**
 * 抽象迭代器角色
 * @author liweihai
 *
 */
public interface Iterator {

	// 下一个元素
	public Object next();
	//是否还有
	public boolean hasNext();
}
