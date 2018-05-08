package Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try
		{Scanner sc = new Scanner(System.in);
		System.out.println("Da-ti x: ");
		int x = sc.nextInt();
		if(x<10)
			throw new Exception("Este mai mic decat 10");  
		} catch(InputMismatchException e) {
			System.out.println("X trebuie sa fie intreg");
		} catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("Sunt la finally!");
		}
		
		try
		{test y=null;
		y.nuFaceNimic();
		} catch (Exception e) {
			System.out.println("Am prins exceptia!");
			e.printStackTrace();
		}

	}

}
