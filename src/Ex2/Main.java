package Ex2;

public class Main {

	public static void main(String[] args) {
		int i= 1;
		while (i<8){
		try {
				
				throw new MyException("Exceptia mea "+ i);
				
			
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally!");
			i++;
		}
	}

}

}
