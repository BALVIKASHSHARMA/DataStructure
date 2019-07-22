package com.dsa.algo.dynamic;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class UglyNumber {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		SortedSet<Long> ss = new TreeSet<>();
		long[] a = new long[10003];
		ss.add((long) 1);

		for (int i = 0; i < 10002; i++) {
			long temp = ss.first();
			a[i + 1] = temp;
			ss.add(temp * 2);
			ss.add(temp * 3);
			ss.add(temp * 5);
			ss.remove(temp);
		}

		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			out.println(a[n]);
		}
		out.close();
		in.close();
	}

}
