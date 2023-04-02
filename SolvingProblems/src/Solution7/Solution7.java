package Solution7;

import java.util.HashSet;

public class Solution7 {
	public int solution(int[] nums) {

		int answer = 0;
		// HashSet ��ü ����
		HashSet<Integer> set = new HashSet<>();
		// ������ ���ڸ� x�� ��� �ݺ��Ѵ�.
		for (int x : nums) {
			// set���ٰ� ������ ���ڸ� ��´�.
			set.add(x);
		}

		// set�� ��ұ⶧���� �ߺ����� �� �������.
		// �ߺ��� ����� set�� ���� �ϳ��� ������ x�� ���������� �ݺ��Ѵ�.
		for (int x : set) {
			if (set.contains(x - 1)) {
				continue;
			}
			int cnt = 0;
			while (set.contains(x)) {
				cnt++;
				x++;
			}
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution7 T = new Solution7();
		System.out.println(T.solution(new int[] { 8, 1, 9, 3, 10, 2, 4, 0, 2, 3 }));
		System.out.println(T.solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0 }));
		System.out.println(T.solution(new int[] { 3, 3, 3, 3, 3, 3, 3, 3 }));
		System.out.println(T.solution(new int[] { -3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1 }));
		System.out.println(T.solution(new int[] { -5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7 }));
	}
}