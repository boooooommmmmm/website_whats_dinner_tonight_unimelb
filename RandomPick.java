import java.util.Random;
import java.util.HashMap;

public class RandomPick {
	public static int weight = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<int[], String> hashMap = new HashMap<int[], String>();
		hashMap = createList();
		Random randomizer = new Random();
		int random = randomizer.nextInt(weight);
		for (int[] key : hashMap.keySet()) {
			if (key[0] < random && key[1] >= random) {
				System.out.println(hashMap.get(key));
			}
		}

		// System.out.println(random);
	}

	public static HashMap<int[], String> createList() {
		HashMap<int[], String> hm = new HashMap<int[], String>();
		hm.put(weightChange(weight, weight += 100), "KFC");
		hm.put(weightChange(weight, weight += 200), "彩云南");
		hm.put(weightChange(weight, weight += 50), "西安名吃");
		hm.put(weightChange(weight, weight += 200), "兰州拉面");
		hm.put(weightChange(weight, weight += 100), "日本拉面");
		hm.put(weightChange(weight, weight += 200), "麻小二");
		hm.put(weightChange(weight, weight += 150), "转角店");
		hm.put(weightChange(weight, weight += 150), "多米诺");
		hm.put(weightChange(weight, weight += 50), "难吃中餐馆");
		hm.put(weightChange(weight, weight += 100), "越南河粉");
		hm.put(weightChange(weight, weight += 100), "烤鱼");
		return hm;

	}

	public static int[] weightChange(int a, int b) {
		int[] c = new int[2];
		c[0] = a;
		c[1] = b;
		return c;
	}
}
