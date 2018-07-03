package pattern.visitor;

import java.util.Random;
import java.util.Vector;

// �ṹ�����ɫ
public class ObjectStructure {

	private Vector<Element> elements;

	// ���캯��
	public ObjectStructure() {
		super();
		elements = new Vector<Element>();
	}

	// ִ�з��ʲ���
	public void action(Visitor vi) {

		for (Element element : elements) {
			element.accept(vi);
		}
	}

	// �����Ԫ��
	public void add(Element e) {
		elements.add(e);
	}

	// Ԫ����������������ͨ��һ��������������ģ��
	public void createElements() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			if (rand.nextInt(100) > 50) {
				// ���Ԫ��1
				this.add(new ConcreteElement1());
			} else {
				// ���Ԫ��2
				this.add(new ConcreteElement2());
			}
		}
	}
}
