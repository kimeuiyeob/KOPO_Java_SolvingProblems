package Solution5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solu5Prac1 {

	public int[] solution(String s) {
		// HashMap ��ü�� �����Ѵ�.
		Map<Character, Integer> HashM = new HashMap<>();
		// ������ 5���� ���� �޴°Ŷ� �迭�� 5�� ��´�.
		int[] answer = new int[5];
		// �Ķ���ͷ� �޾ƿ� ���ڿ��� text�� ��´�.
		String text = s;
		// text�� char�迭�� ��������� �ݺ������� -> �����ϳ��ϳ� �ݺ������̴�.
		for (char key : text.toCharArray()) {
			// ������ ���ڸ� Ű������ �ΰ� ������� ������Ų��.
			HashM.put(key, HashM.getOrDefault(key, 0) + 1);
		}
		// �ִ밪�� ���ϱ� ���� max������ �����Ѵ�.
		// �׸��� HashM�� �ִ� ���� ��´�. -> ������ ������� �ٺ��ؼ� ����ū���� ��������.
		int max = HashM.get(text.charAt(0));
		// ���⼭ ��� ������� ������ ������� ���� max�� ��´�.
		for (int i = 0; i < text.length(); i++) {
			if (max < HashM.get(text.charAt(i))) {
				max = HashM.get(text.charAt(i));
			}
		}
		// ������ a~e������ �󵵼��� ������ϱ� ������ abcde���ڿ��� �����Ѵ�.
		String alphabet = "abcde";
		// 5�� �ݺ�����.
		for (int i = 0; i < alphabet.length(); i++) {
			// ù��° �ε������� ���� ��´�.
			// �ִ밪���� a���� e������ ������� �����´����� max���� �� ������� ���� ���� �迭�� ������
			// �̰� �󵵼��� ���ߴ°Ŵ�.
			answer[i] = max - HashM.getOrDefault(alphabet.charAt(i), 0);
		}

		return answer;
	}

	public static void main(String[] args) {
		Solu5Prac1 T = new Solu5Prac1();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}