package practice01;

class Cars
{
	int num;
	double gas;
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	void show()
	{
		System.out.println("차량번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
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