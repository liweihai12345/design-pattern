package pattern.interator.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// ����һ�����ϣ���ŶԻ�������
		ArrayList list =new ArrayList();
		list.add("���ǵ��Ż��ѱ�����ȫ�����٣�̹�״ӿ��ܴ��ϡ�����ϣ��������������ǣ��������ǻ������������ᴦ��");
		list.add("����ͬ־���ұ�֤��ȫ������ǡ�");
		list.add("���ڶ����Ż��е���ʲô��ɫ");
		list.add("����Ҫ������ϵ��Һ�����");
		list.add("���ǵĻ�Դ��Ҫ���������ģ�");
		list.add("��Ҫ�Ǵ�Y�����⣬�������˭��Ҳ�������һ�㶼�����氲�������ġ�");
		list.add("�㸺��Ķ�Ʒ������������");
		list.add("������Ҫ������ZZ�������ۣ�һ�㶼��һЩ�������������������û���");
		list.add("˵һ�¾������������û��˵�������");
		list.add("H�� ��F�գ�S�� �ȵ�");
		// ��������
		System.out.println("������ﷸ����Ѷ�Ի����£�");
		show(list.iterator());
		
		
		
	}

	private static void show(Iterator iterator) {
		int i =0;
		while(iterator.hasNext()){
			if(i%2==0){
				System.out.println("����˵��"+iterator.next());
			}else{
				System.out.println("XX�ﷸ˵��"+iterator.next());
			}
			i++;
		}
		
	}
}
