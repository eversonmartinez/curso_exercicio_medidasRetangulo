package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rec.width = sc.nextInt();
		rec.height = sc.nextInt();
		
		System.out.println();
		System.out.println("AREA = " + rec.area());
		System.out.println("PERIMETER= " + rec.perimeter());
		System.out.println("DIAGONAL = " + rec.diagonal());
		
	}

}
