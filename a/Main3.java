importv java.util.Scanner;

class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		car.setName("フェラーリ");
		car.setColor("赤");
		Bicycle bicycle = new Bicycle();
		bicycle.setName("ビアンキ");
		bicycle.setColor("緑");

		System.out.println("【車の情報】");
		car.printData();
		System.out.println("ガソリン量：" + car.getFuel() + "L");

		System.out.println("-----------------");
		System.out.print("給油する量を入力してください：");
		int litre = scanner.nextInt();
		car.change(litre);

		System.out.println("-----------------");
		System.out.print("走る距離を入力してください：");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycle.Distance);

		System.out.println("=================");
		System.out.println("【自転車の情報】");
		bicycle.printData();
	}
}