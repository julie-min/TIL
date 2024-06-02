package 비선형구조;

import java.util.HashMap;

public class 완주하지못한선수동명이인반영 {

	public static void main(String[] args) {
		String[] p = { "leo", "kiki", "eden" }; // +1
		String[] e = { "eden", "kiki" }; // -1
		// 완주한 선수는 0이 될 예정임.

		HashMap<String, Integer> map = new HashMap<>();
		for (String x : p) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println(map);

		for (String x : e) {
			map.put(x, map.getOrDefault(x, 0) - 1);
		}
		System.out.println(map);
		String answer ="";
		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer += key;
			}
		}
		System.out.println(answer);
	}
}