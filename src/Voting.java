import java.util.Scanner;

public class Voting {
   static String party1="NeoTeric Methods";
    static String party2="NeoTeric Technologies";
    static int party1VoteCounts=0;
    static int party2VoteCounts=0;
    void casteVote(int n) {

        switch (n) {
            case 1: {
                System.out.println("Successfully voted for " + party1);
                party1VoteCounts++;
                break;
            }
            case 2: {
                System.out.println("Successfully voted for " + party2);
                party2VoteCounts++;
                break;
            }

        }
    }
        void results()
        {
            if (party1VoteCounts>party2VoteCounts)
            {
                System.out.println(party1+" won the elections with "+ (party1VoteCounts-party2VoteCounts) +" majority");
            }
            else
                System.out.println(party2+" won the elections with "+ (party2VoteCounts-party1VoteCounts) +" majority");
        }
}

