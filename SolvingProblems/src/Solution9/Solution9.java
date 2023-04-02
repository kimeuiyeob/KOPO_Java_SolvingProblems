package Solution9;

import java.util.Arrays;

public class Solution9 {

	public int solution(int[] nums, int m) {

		// ������ �迭�� ���������κ��� ����
		Arrays.sort(nums);
		int answer = 0;
		// �迭 ó�� ��
		int left = 0;
		// �迭 ������ ��
		int right = nums.length - 1;

		while (left <= right) {
			// �迭�� ó������ ������ ���� m���� �۰ų� ������ �θ��̼� �踦 �ϳ� Ż���ִٴ� ���̴�.
			if (nums[left] + nums[right] <= m) {
				// ���� true��� ���ϳ��� ī��Ʈ�Ѵ�.
				answer++;
				// left++�� ���� ������ ����� ���� 1�� ����
				left++;
				// ������ �迭���� ��ĭ �դ�����...
				right--;
				// ���� ��ó�� �迭�� ������ �迭�� ���� m���� ũ�ٸ�
			} else {
				// �踦 �ϳ� ī��Ʈ���ְ�
				answer++;
				// ������ �迭���� ��ĭ ������... ������ ��� �迡 �¿���̴�.
				right--;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution9 T = new Solution9();
		System.out.println(T.solution(new int[] { 90, 50, 70, 100, 60 }, 140));
		System.out.println(T.solution(new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 }, 100));
		System.out.println(T.solution(
				new int[] { 68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81 }, 120));
	}
}