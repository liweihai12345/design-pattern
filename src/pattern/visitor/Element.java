package pattern.visitor;

/**
 * ����Ԫ�ؽ�ɫ
 * @author liweihai
 *
 */
public abstract class Element {

	// ���ղ���
	public abstract void accept(Visitor v);
}
