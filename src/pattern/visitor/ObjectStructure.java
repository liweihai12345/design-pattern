package pattern.visitor;

import java.util.Random;
import java.util.Vector;

// 结构对象角色
public class ObjectStructure {

	private Vector<Element> elements;

	// 构造函数
	public ObjectStructure() {
		super();
		elements = new Vector<Element>();
	}

	// 执行访问操作
	public void action(Visitor vi) {

		for (Element element : elements) {
			element.accept(vi);
		}
	}

	// 添加新元素
	public void add(Element e) {
		elements.add(e);
	}

	// 元素生成器，这里是通过一个工厂方法进行模拟
	public void createElements() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			if (rand.nextInt(100) > 50) {
				// 添加元素1
				this.add(new ConcreteElement1());
			} else {
				// 添加元素2
				this.add(new ConcreteElement2());
			}
		}
	}
}
