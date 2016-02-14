package basicExercise.percentage;

//http://blog.csdn.net/snow0123/article/details/5424145

public class AllSort {
	public static int[][] result;
	private static int count;

	public static void main(String[] args) {
		int buf[] = { 1, 2, 3 };
		result = new int[getPossible(buf.length)][buf.length];
		perm(buf, 0, buf.length - 1);
		printList(result);
	}

	public static int[][] genList(int time) {
		int buf[] = createList(time);
		result = new int[getPossible(buf.length)][buf.length];
		count = 0;
		perm(buf, 0, buf.length - 1);
		//printList(result);
		return result;
	}

	private static int[] createList(int num) {
		int[] list = new int[num];
		for (int i = 0; i < num; i++) {
			list[i] = i;
		}
		return list;
	}

	public static void printList(int[][] list) {
		System.out.print(count + "\t");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++)
				System.out.print(list[i][j] + " ");
			System.out.print("\t");
		}
		System.out.println("");
	}

	private static int getPossible(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++)
			result *= i;
		return result;
	}

	private static void perm(int[] buf, int start, int end) {
		if (start == end) {// ��ֻҪ���������һ����ĸ����ȫ����ʱ��ֻҪ�Ͱ�������������ɣ����������
			for (int i = 0; i <= end; i++) {
				// System.out.print(buf[i]);
				result[count][i] = buf[i];
			}
			// System.out.println("\t" + count);
			count++;
		} else {// �����ĸȫ���У��ձ������
			for (int i = start; i <= end; i++) {// ����ָ��start�ֱ�ָ��ÿһ������
				int temp = buf[start];// ���������һ��Ԫ���������Ԫ��
				buf[start] = buf[i];
				buf[i] = temp;

				perm(buf, start + 1, end);// ����Ԫ�صݹ�ȫ����

				temp = buf[start];// ������������黹ԭ
				buf[start] = buf[i];
				buf[i] = temp;
			}
		}
	}
}
