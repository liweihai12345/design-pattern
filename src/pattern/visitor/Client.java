package pattern.visitor;

public class Client {

	public static void main(String[] args) {
		
		// 创建一个结构对象
		ObjectStructure os= new ObjectStructure();
		
		// 生成元素
		os.createElements();
		// 创建一个访问者对象
		Visitor vi= new ConcreteVisitor();
		// 访问者对结构进行访问（执行访问）
		os.action(vi);
	}
}
