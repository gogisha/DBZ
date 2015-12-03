package dragonballZ;

import java.util.Scanner;

public class Vegeta {
	public static void main(String[] args){

		final int KAKAROT = 9000;		

		System.out.println("Nappa: Hey Vegeta, what does the scouter say about his power level?");

		System.out.println("[Input the power level that the scouter reads and press enter.]");

		Scanner scouter = new Scanner(System.in);

		int powerLevel = scouter.nextInt();

		System.out.println("[The scouter reads a power level of " + powerLevel + ".]");

		if (powerLevel > KAKAROT){

			System.out.println("Vegeta: It's over 9000!!!!!");

			System.out.println("[Vegeta destroys his scouter.]");

			System.out.println("Nappa: What?! 9000?!?!?!?!");}

			else {System.out.println("Vegeta: It's " + powerLevel + ".");

				System.out.println ("Nappa: Ah, thanks Vegeta.");

			}
	}
}
