public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while(number < 5) {
			System.out.println(number * number);
			number++;
		}

		int array[] ={ 1, 20, 30, 333 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array.length[i])
		}

		for (int val : array) {
			if (val % 2 == 0){
				continue;
			}
			System.out.println(val);
		}
	}
}