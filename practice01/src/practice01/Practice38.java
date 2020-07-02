package practice01;

class Dumptruck
{
	private int num;
	private double gas;
	
	public Dumptruck() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public void setDumptruck(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호는" + num + "이고, 연료 양은" + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
	System.out.println("차량번호는" + num + "입니다.");
	System.out.println("연료 양은" + gas + "입니다.");
	}
}

class Practice38
{
	public static void main(String[] args)
	{
		Dumptruck[] cars;
		cars = new Dumptruck[3];
		
		for(int i = 0; i<cars.length; i++) {
		cars[i] = new Dumptruck();
		}
		
		cars[0].setDumptruck(1234, 20.5);
		cars[1].setDumptruck(2345, 30.5);
		cars[2].setDumptruck(3456, 40.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	
	
	
	}
}