package practice01;

class Carss
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("���� ��ȣ�� �����߽��ϴ�.");
		return num;
	}
	
	double getGas()
	{
		System.out.println("���� ���� �����߽��ϴ�.");
		return gas;
	}
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("���� ��ȣ��" + num + "����, ���� ����" + gas + "�� �ٲپ����ϴ�.");
	}
	void show()
	{
		System.out.println("������ȣ��" + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

class Practice29
{
	public static void main(String[] args)
	{
		Carss car1 = new Carss();
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("���� �ڵ����� ������ ���");
		System.out.println("���� ��ȣ��" + number + "����, ���� ����" + gasoline + "�̾����ϴ�.");
	}
}