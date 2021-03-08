package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5};
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			return; //finally���� ����ǰ� �����. >> end�� ��µ�������.
		}finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
 /*
 << ��Ʈ���� ���� >>
 1) ��� ����
 - �Է� ��Ʈ�� / ��� ��Ʈ��
  + �Է� ��Ʈ�� : ������� ���� �ڷḦ �о� ���̴� ��Ʈ��
  + ��� ��Ʈ�� : ������� �ڷḦ ����ϴ� ��Ʈ��
 
 2) �ڷ��� ����
 - ����Ʈ ��Ʈ�� / ���� ��Ʈ��
 
 3) ���
 - ��� ��Ʈ�� / ���� ��Ʈ��
  + ��� ��Ʈ�� : ��� ���� �ڷḦ �а� ���� ����� ��Ʈ��
  + ���� ��Ʈ�� : ���� �а� ���� ����� ���� �߰����� ����� �ϴ� ��Ʈ��
  
  << ǥ�� ����� >>
  - 
 */