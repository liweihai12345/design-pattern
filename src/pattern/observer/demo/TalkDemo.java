package pattern.observer.demo;

public class TalkDemo {

	public static void main(String[] args) {
		// �����������
		ConcreteTalkSubject talkSubject= new ConcreteTalkSubject();
		// �����۲���
		ITalkObserver talker1= new ConcreteTalkObserver("����");
		ITalkObserver talker2 = new ConcreteTalkObserver("����");
		// ��ӹ۲���
		talkSubject.registerObserver(talker1);
		talkSubject.registerObserver(talker2);
		// Ϊ����������Ϣ
		talkSubject.setMsg("���쿴��һλ�ϴ�үˤ���ڵ��ϣ�û����ȥ���ϴ�ү��");
	}
}
