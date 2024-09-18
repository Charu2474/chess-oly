import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        double ourScore = X + 0.5 * Y;
        int gamesPlayed = X + Y + Z;
        double opponentScore = Z + 0.5 * Y;
        int remainingGames = 4 - gamesPlayed;
        if (ourScore + remainingGames > opponentScore) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();

	}
}
