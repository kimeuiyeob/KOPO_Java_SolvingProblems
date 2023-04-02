package Solution3;

public class Solu2Prac {

	public int solution(int[][] board) {

		// �ε��� ���� ������ �Ѿ�� �ȵǱ⶧���� ���̸� ������ ��´�.
		int finalLine = board.length;

		// ���� ����
		int[] direcX = { -1, 0, 1, 0 };
		int[] direcY = { 0, 1, 0, -1 };

		// ����� ���� ���� ��ġ ��ǥ
		int[] human = new int[2];
		int[] dog = new int[2];

		// ������ �迭�̱⶧���� ���� �ݺ������� ����� ���� ��ġ ã��
		for (int i = 0; i < board.length; i++) {
			int[] boardArry = board[i];
			for (int j = 0; j < boardArry.length; j++) {
				if (board[i][j] == 2) {
					human[0] = i;
					human[1] = j;
				}
				if (board[i][j] == 3) {
					dog[0] = i;
					dog[1] = j;
				}
			}
		}
		// ���,������ ����
		int directionForHuman = 0;
		int directionForDog = 0;
		int count = 0;

		while (count < 10000) {
			count++;
			// ������ġ + ������ ������ ��´�.
			int x1 = human[0] + direcX[directionForHuman];
			int y1 = human[1] + direcY[directionForHuman];

			int x2 = dog[0] + direcX[directionForDog];
			int y2 = dog[1] + direcY[directionForDog];

			// ���,������ �÷��� �α�
			boolean flag1 = true, flag2 = true;
			// ��ġ�� 0���� �۰ų� ���̺��� ũ�ų� 1�� ������ ������ȯ
			if (x1 < 0 || x1 >= finalLine || y1 < 0 || y1 >= finalLine || board[x1][y1] == 1) {
				directionForHuman = (directionForHuman + 1) % 4;
				// �̶� flag�� �ξ� �Ʒ� true���ȿ� ���� �ȴ��� ���´�. �׸��� �ٽ� �ݺ������� flag�� true�� �ʱ�ȭ�ȴ�.
				flag1 = false;
			}
			if (x2 < 0 || x2 >= finalLine || y2 < 0 || y2 >= finalLine || board[x2][y2] == 1) {
				directionForDog = (directionForDog + 1) % 4;
				flag2 = false;
			}
			// �� ���ǹ��� ���յǸ� ���� �ȴ��� �ȴ�.
			if (flag1 == true) {
				human[0] = x1;
				human[1] = y1;
			}
			if (flag2 == true) {
				dog[0] = x2;
				dog[1] = y2;
			}
			// ���,������ ��ǥ�� ���ٸ� ���� �������� ������ �Ȱ��̹Ƿ� break �ݺ��� Ż�� -> ���� ī��Ʈ�� ���� ����
			if (human == dog)
				break;
		}
		if (count >= 10000)
			return 0;

		return count;
	}

	public static void main(String[] args) {
		Solution3 T = new Solution3();
		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 } };
		System.out.println(T.solution(arr1));
		int[][] arr2 = { { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 3 } };
		System.out.println(T.solution(arr2));
	}

}