package pattern.mediator.demo;

/**
 * ����
 * @author liweihai
 *
 */
public class Test {

	public static void main(String[] args) {
		MarriageAgency agency= new MarriageAgencyImpl();
		Person m1=new Man("����", 27, 18, agency);
		Person m2=new Man("����", 20, 25, agency);
		Person w1=new Woman("����", 25, 27, agency);
		Person w2=new Woman("����", 20, 22, agency);
		m1.findPartner();// ƥ��
		
		m2.findPartner();// ƥ��
		w1.findPartner();// ƥ��
		w2.findPartner();// ƥ��
	}
}
