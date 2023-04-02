package Solution5;

import java.util.Arrays;
import java.util.HashMap;

public class Solution5 {
	public int[] solution(String s) {
		// �켱 a~e������ ���ĺ����� ������ �����ֱ⶧����
		// 5ĭ�� �迭�� �����Ѵ�.
		int[] answer = new int[5];
		// HashMap�� �����Ѵ�. Ű�� char ����� int�� �����⶧���� ���׸��ȿ��� �������ش�.
		HashMap<Character, Integer> sH = new HashMap<>();
		// �ݺ����� ������ -> s�Ķ���ͷ� �Ѿ�� ���ڿ��� toCharArry�� char�� �迭�� ������� ������ ���ڷ� �ݺ��� ������.
		for (char x : s.toCharArray()) {
			// ������ ���ڸ� Ű������ �ְ� ������� ���� ���ڰ� �� �´ٸ� �������Ѽ� sh�� ��´�.
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		// �ִ밪�� ���ϱ� ���� ���� �ϳ��� �����ϰ� ���� IntegerŬ�������� �������� ���� ��Ƴ��´�.
		// �� �����ٴ� max���� Ŭ�ű� �����̴�.
		int max = Integer.MIN_VALUE;

		String tmp = "abcde";
		// abcde�� ���ڷ� �ݺ��� ������.
		for (char key : tmp.toCharArray()) {
			// �ִ밪�� ���ؾ��ϱ� ������ ������ Ű�� �ݺ�������.
			// ������� max���� ũ�ٸ� �� ������� max�� ��´�.
			// �̷��� ���� �ݺ��� ���ٺ��� ������� ���� ������ max�� ���Եȴ�.
			if (sH.getOrDefault(key, 0) > max) {
				max = sH.getOrDefault(key, 0);
			}
		}
		// a~e������ �ݺ� �� 5�� �ݺ��� ������.
		for (int i = 0; i < tmp.length(); i++) {
			// �迭 ó������ ���� ���� ����ش�.
			// a���� ��� ���� ������ max���� ���ذ��� �迭�� ��´�. -> �̷��� ���� �󵵼��� ���������.
			answer[i] = max - sH.getOrDefault(tmp.charAt(i), 0);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 T = new Solution5();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}