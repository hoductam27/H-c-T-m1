package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * cau 3
         */
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		
		int t = tong(n);
		System.out.println(t);}
	static int tong(int n) {
		int t = 0;
		for(int i=0; i <= n; i++) {
			t += i;
		}
		return t;
	}

}
