package exceptions;

public class TestException {

	public static void main(String[] args) {
		try {
			int val = 10 / 0;
			System.out.println(val);
			
		} catch (Exception e) {
			
			throw new DivisaoPorZeroException();
			
		}

	}

}
