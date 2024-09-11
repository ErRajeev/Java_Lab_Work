public class RatTravasForFood {

	public static int food(int r, int[] arr, int unit, int n) {
		if (n == 0) {
			return -1;
		} else {
			int foodreq = r * unit;
			int foodget = 0;
			int travleHouse = 0;
			for (int i : arr) {
				if (foodget >= foodreq) {
					return travleHouse;
				}
				foodget += i;
				travleHouse++;
			}
			return 0;
		}
	}

	public static void main(String... arg) {
		int r = 7;
		int unit = 2;
		int n = 8;
		int[] arr = { 2, 8, 3, 5, 7, 4 };
		int res = food(r, arr, unit, n);
		System.out.println(res);
	}
}
