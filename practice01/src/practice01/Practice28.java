package practice01;

class Cars
{
	int num;
	double gas;
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

class Practice28
{
	public static void main(String[] args)
	{
		Cars car1 = new Cars();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,  gasoline);;
	}
}