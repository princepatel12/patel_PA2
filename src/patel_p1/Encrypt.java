package patel_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		int encrypt, i = 3;
		int e1, e2, e3, e4;
		int hold[] = new int[5];
		int hold2[] = new int[5];
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the a 4-digit integer you want to encrypt: ");
		encrypt = in.nextInt();
		
		while(encrypt > 0)
		{
			hold[i] = encrypt % 10;
			encrypt = encrypt / 10;
			i--;
		}
		
		hold2[2] = (hold[0] + 7) % 10;
		hold2[3] = (hold[1] + 7) % 10;
		hold2[0] = (hold[2] + 7) % 10;
		hold2[1] = (hold[3] + 7) % 10;
		
		e1 = hold2[0];
		e2 = hold2[1];
		e3 = hold2[2];
		e4 = hold2[3];
		
		System.out.print("The encrypted integer is: " +e1+e2+e3+e4);

	}

}