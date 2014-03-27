package junitdemo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/*
 * �o�ӽd�ҥD�n�n�i�ܡy�p�󥿽T���]�p ���`���� (testing exception) ����k�C
 * �`�N���n����ղ��`�M�@�몺�\����թ�b�@�Ӧa�����
 */
public class JUnitDemo02 {

	/*
	 * �o�O�\��O�_���`
	 */
	@Ignore
	@Test	
	public void test1() {
		F f = new F();
		//�o�̥[�W try...catch �O���F�� compiler happy
		try {
			//���`�����ծר�
			assertEquals(12, f.div(12, 1));

			// �H�U�G�N����ծרҼg���C�� JUnit �J�즹���~��|����A�ҥH�U�@�ӿ��~�N���|�Q�ˬd�X�ӡC
			assertEquals(13, f.div(12, 1));
			// �o�Ӥ]�O���~��
			assertEquals(24, f.div(12, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * ���ղ��`�O�_�p�w�����ߥX (Testing exception)
	 * �`�N @Test �ᦳ�[�W expected = Exception.class; test2() �ᦳ throws Exception
	 */
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		F f = new F();
		assertEquals(13, f.div(12, 1)); //���n�����ծרҳ]�p�A������ test1 ������
		assertEquals(1, f.div(12, 0)); //test2 �̭����ӳ��O���`������
	}

	/*
	 * The class to be tested
	 */
	class F {
		public int div(int x, int y) throws Exception {
			// if (y==0) throw new Exception("divided by 0");

			return x / y;
		}
	}// class F

}
