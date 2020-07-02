package practice01;

class Carr
{
	private int num;
	private double gas;
	
	public Carr() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public void show() {
	System.out.println("차량번호는" + num + "입니다.");
	System.out.println("연료 양은" + gas + "입니다.");
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