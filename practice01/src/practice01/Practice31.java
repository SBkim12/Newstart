package practice01;

class Carr
{
	private int num;
	private double gas;
	
	public Carr() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public void show() {
	System.out.println("������ȣ��" + num + "�Դϴ�.");
	System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

class Practice31
{
	public static void main(String[] args)
	{
		Carr car1 = new Carr();
		
		car1.show();
	}
}