package pattern.visitor;

public class Client {

	public static void main(String[] args) {
		
		// ����һ���ṹ����
		ObjectStructure os= new ObjectStructure();
		
		// ����Ԫ��
		os.createElements();
		// ����һ�������߶���
		Visitor vi= new ConcreteVisitor();
		// �����߶Խṹ���з��ʣ�ִ�з��ʣ�
		os.action(vi);
	}
}
