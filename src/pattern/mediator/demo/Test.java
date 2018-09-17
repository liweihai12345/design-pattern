package pattern.mediator.demo;

/**
 * ²âÊÔ
 * @author liweihai
 *
 */
public class Test {

	public static void main(String[] args) {
		MarriageAgency agency= new MarriageAgencyImpl();
		Person m1=new Man("ÕÅÈı", 27, 18, agency);
		Person m2=new Man("ÀîËÄ", 20, 25, agency);
		Person w1=new Woman("çúçê", 25, 27, agency);
		Person w2=new Woman("ÕäÖé", 20, 22, agency);
		m1.findPartner();// Æ¥Åä
		
		m2.findPartner();// Æ¥Åä
		w1.findPartner();// Æ¥Åä
		w2.findPartner();// Æ¥Åä
	}
}
