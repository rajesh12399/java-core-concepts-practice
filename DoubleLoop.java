package com.core.test;

import java.util.Scanner;

public class DoubleLoop {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 1; j <= n; j++) {
				int tolval = 0;

				int count = 1;
				for (int j2 = 1; j2 <= j; j2++) {

					tolval = tolval + (count * b);

					count = count + count;
					
				}

				System.out.print(a + tolval);
				System.out.print(" ");
			}
			System.out.println();
		}
		in.close();
	}

}
