
public class Sugoroku {

	public static void main(String[] args) throws Exception {

		int goal = 8;

		System.out.println("サイコロを振る。1回目");

		int val1 = (int) (Math.random() * 6) + 1;
		System.out.println(val1 + "が出ました。");

		goal = goal - val1;

		System.out.println("サイコロを振る。2回目");

		int val2 = (int) (Math.random() * 6) + 1;
		System.out.println(val2 + "が出ました。");

		goal = goal - val2;

		if (goal <= 0) {
			System.out.println("ゴールしました。");
		}
	}
}
