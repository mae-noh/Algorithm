package beakjoon.ETC;

import java.util.Scanner;

public class boj14681 {

	public static void main(String[] args) {
		
		int x,y=0;
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		if(x<0 && y>0) {
			System.out.println("2");
		}
		if(x<0 && y<0) {
			System.out.println("3");
		}
		if(x>0 && y<0) {
			System.out.println("4");
		}
	}
	
}
