package Solution9;

import java.util.Arrays;

public class Solu9Prac {

	public int solution(int[] nums, int m) {
		// �迭���� ������ ���������� ū���� �����Ѵ�.
		Arrays.sort(nums);

		int answer = 0;

		int[] humanWeight = nums;
		int limitWeight = m;

		int frotntArr = 0;
		int lastArr = nums.length - 1;

		// �Ʒ� ���ǹ���
		// ���� ���� ���� ���� ū���� ���ؼ� ���� �װ� �Ѱ�����Ժ��� �۴ٸ� 2���� �¿��
		// �� ũ�ٸ� �� ū�� 1���� �迡 �¿��
		// �ε��� ������ ���� 2��°�� �������� 2��°�� ū�� �̷������� �����ؼ� ��z ī�����ϴ°Ŵ�.
		while (frotntArr <= lastArr) {
			if (humanWeight[frotntArr] + humanWeight[lastArr] <= limitWeight) {
				answer++;
				frotntArr++;
				lastArr--;
			} else {
				answer++;
				lastArr--;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solu9Prac T = new Solu9Prac();
		System.out.println(T.solution(new int[] { 90, 50, 70, 100, 60 }, 140));
		System.out.println(T.solution(new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 }, 100));
		System.out.println(T.solution(
				new int[] { 68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81 }, 120));
	}
}