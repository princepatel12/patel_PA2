package patel_p1;

import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args) {
	
	int d1, d2, d3, d4;
	int decrypt, i = 3;
	int hold[] = new int[5];
	int hold2[] = new int[5];
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the 4-digit integer you want to decrypt: ");
	decrypt = in.nextInt();
	
	while(decrypt > 0)
	{
		hold[i] = decrypt % 10;
		decrypt = decrypt / 10;
	}
	
	hold2[0] = hold[3];
	hold2[1] = hold[4];
	hold2[2] = hold[0];
	hold2[3] = hold[1];
	
	d1 = (hold2[0] + 3) % 10;
	d2 = (hold2[1] + 3) % 10;
	d3 = (hold2[2] + 3) % 10;
	d4 = (hold2[3] + 3) % 10;
	
	System.out.println("The decrypted integer is: " +d1+d2+d3+d4);
}
}