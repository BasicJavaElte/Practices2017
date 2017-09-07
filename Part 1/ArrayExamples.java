/*

	Most of the examples here are adapted from the Java Tutorial =)
	https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

*/

/*
	Stuart is the owner of Gambling Loteries Inc, and he is facing a very serious problem
	the lady who usually takes out the balls with the numbers resigned and he has no one to replace her

	Lászlo, a good friend of him, provided a Virtual Reality robot able to do it for him,
	the only thing that Stuart needs to do is to provide the numbers on a screen separated by line.

	So everything Stuart needs now to save Gamblung Inc from bankruptcy is to find someone who can
	build an algorithm able to sort the 30 numbers from 0 to 50 and print them on the default screen.


	Can you help Stuart?

*/


import java.util.Random;

public class ArrayExamples
{

	static private int pickRandomNumber(){
		Random rand = new Random();
		return rand.nextInt(50);
	}

	public static void main(String[] args) {

		// Here we define a final integer, it means that this is the definitive value of it
		final int NUMBERS = 30;
		// Now we tell java to reserve the space of NUMBERS integers in the memory
		int sortedNumbers[]= new int[NUMBERS];

		// Here we go now feeding the array
		for(int i=0; i<NUMBERS; i++){
				sortedNumbers[i] = pickRandomNumber();
		}

		// And finally printing it one by one
		for(int i=0; i<NUMBERS; i++){
			System.out.println(sortedNumbers[i]);
		}

		/*
			TODO:TODO TODO TODO TODO TODO TODO TODO

			OW NO, the last night lotery was a disaster, ow boy...
			The Algorith sorted repeated numbers,
			You need to urgently fix it to read the Array and replace the repeated
			numbers with other sorted numbers or, fix it during sorting.

			TODO TODO TODO TODO TODO TODO TODO TODO
		*/
	}
}
