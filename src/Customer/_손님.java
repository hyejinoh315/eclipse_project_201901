package Customer;

import java.util.Random;

public class _�մ� extends Thread {
	Random ran = new Random();

	String nameC; // �Ϲݼմ�
	String m = null;
	String b = null;

	public _�մ�() {
		this.nameC = "�������� �մ�";
	}

	public String �ֹ�(String name) { // ����� ���� �ٸ� �޴��迭�� ���´�
		//String f = null; ����Ʈ �����ϱ�!******	
		if (name.equals("Ʈ��")) {
			String[] menu = { "�Ƹ޸�ī��", "��" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " �ּ���."); // �������� �༭ �־��� �޴��߿� �������� �����Ű��
		} else if (name.equals("����")) {
			String[] menu = { "�Ƹ޸�ī��", "��", "�����ֽ�", "Ű���ֽ�", "�丶���ֽ�" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " �ּ���."); // �������� �༭ �־��� �޴��߿� �������� �����Ű��
		} else if (name.equals("�귱ġ")) {
			String[] menu = { "�Ƹ޸�ī��", "��", "�����ֽ�", "Ű���ֽ�", "�丶���ֽ�", "���̱�", "������ġ", "����ũ" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " �ּ���."); // �������� �༭ �־��� �޴��߿� �������� �����Ű��
		} else if (name.equals("���̴�")) {
			String[] menu = { "�Ƹ޸�ī��", "��", "�����ֽ�", "Ű���ֽ�", "�丶���ֽ�", "���̱�", "������ġ", "����ũ", "�Ľ�Ÿ", "������ũ" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " �ּ���."); // �������� �༭ �־��� �޴��߿� �������� �����Ű��
		}
		return m; // �մ��� �ֹ��� �޴� ������ ����
	}
	
	public String ���ֹ�(String name) { // ����� ���� �ٸ� �޴��迭�� ���´�
		//String f = null; ����Ʈ �����ϱ�!******	
		if (name.equals("Ʈ��")||name.equals("����")) {
		} else {
			String[] menu = { "�Ƹ޸�ī��", "��", "�����ֽ�", "Ű���ֽ�", "�丶���ֽ�" };
			b = menu[ran.nextInt(menu.length)];
			System.out.println("\n\n  " + nameC + " - ����� " + b + "�� �ּ���."); // �������� �༭ �־��� �޴��߿� �������� �����Ű��
		}
		return b; // �մ��� �ֹ��� �޴� ������ ����
	}

	public int ����(int ����) {
		System.out.println("\n\n  "+ nameC +" - �����մϴ�. �����ϼ���^o^");
		����++;
		return ����;
	}

	public int ȭ��(int ����) {
		System.out.println("\n\n  "+ nameC +" - Oh My God! �ٽô� �� ���� �˾ƿ�!\n\n\n�մ��� ȭ�� ���� �������Ƚ��ϴ�.");
		���� -= 2;
		return ����;
	}
	
//	public void run() {
//		�ֹ�(ī��.name);
//		//10�� ��ٸ��� �߿� �޴��� ����� ������ �����Ѵ�
//		if (m == "���̱�" || m == "������ġ" || m == "����ũ" || m == "�Ľ�Ÿ" || m == "������ũ") {
//			���ֹ�(ī��.name);
//			
//			if (ī��.����.equals(m + b)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
//			����(ī��.����);
//			}
//			//�߸� �����ų� 10�ʳѾ�� ȭ���� ������
//			ȭ��(ī��.����);
//		}
//		
//		
//		����(ī��.����);
//		
//		//�߸� �����ų� 10�ʳѾ�� ȭ���� ������
//		ȭ��(ī��.����);
//	}
}
