
package Animals.fish;

import java.util.Random;
import java.util.Scanner;

public class TextNumberGuessingGame {
public static void main(String[] args) {

Random ran = new Random();
int result = ran.nextInt(101);
System.out.println(result);
int[] guessArray = new int[10];

Scanner scan = new Scanner(System.in);
System.out.println("Please guess a number between 0-100");

int guess = -1;
int count = 0;
while (guess != result) {

//End the game if it took them more than 10 tries
if (count == 10) {
break;
}
guess = scan.nextInt();
guessArray[count] = guess;

if (guess < result) {
System.out.println("Very low");

} else if (guess > result) {
System.out.println("very high");
} else {
System.out.println("You got it");
}
count++;
} // WHILE LOOP ENDS (GAME ENDS)


if (count >= 10) {
System.out.println("SORRY GAME OVER,IT TOOK YOU TOO MANY TRIES");

} else {
System.out.println("Thanks for playing.  YOU WON !!");
System.out.println("It took " + count + " Tries");
}

System.out.println("Below are your guessed numbers:");

for (int i = 0; i < count; i++) {
System.out.println(guessArray[i]);
}
}
}




