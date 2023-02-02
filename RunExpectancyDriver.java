import java.util.*;
import java.text.DecimalFormat;

public class RunExpectancyCalculator 
{
    public static void main(String[] args)
    {

        ArrayList<Double> stats = new ArrayList<Double>();

        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.000");

        int[] runnerLocationIndex = {0, 1, 2, 3, 12, 13, 23, 123};
        System.out.println("\n\n\n\n\nWelcome to the Run Expectancy calculator. Here are your menu options. These numbers represent the location for the runners are on base.");
        System.out.println(Arrays.toString(runnerLocationIndex));

       boolean isPitcherStillIn = true;
       while(isPitcherStillIn)
       {
            System.out.print("\n\n\nPitcher Still In? Y/N: ");
            String answer = console.next();

            if (answer.substring(0,1).equalsIgnoreCase("y"))
            {
                System.out.print("\nWhere are the runners at? ");
                int runnerLocation = console.nextInt();
                System.out.print("How many outs are there? ");
                int outs = console.nextInt();

                RunExpectancyStats stat = new RunExpectancyStats();
                System.out.println(stat.getNum(outs, runnerLocation));

                System.out.println("\nNext Situation: \n");
                System.out.print("Where are the runners at? ");
                int runnerLocation2 = console.nextInt();
                System.out.print("How many outs are there? ");
                int outs2 = console.nextInt();
                System.out.println(stat.getNum(outs2, runnerLocation2));
                
                stats.add((stat.getNum(outs, runnerLocation) - stat.getNum(outs2, runnerLocation2)));

                System.out.println("\nHere is the difference:\n");
                System.out.println(stat.getNum(outs, runnerLocation) - stat.getNum(outs2, runnerLocation2));
            }

            if(!answer.substring(0,1).equalsIgnoreCase("y"))
            {
                isPitcherStillIn = false;
            }
       }

       double sum = 0;
       for (Double _stats : stats)
       {
            sum += _stats;
       }
       System.out.println("The sum for the inning: " + df.format(sum));

       System.out.print("Did any runs score that inning? Y/N ");
       String isRuns = console.next();

       if(isRuns.substring(0,1).equalsIgnoreCase("y"))
       {
            System.out.print("How many runs scored? ");
            int runsScored = console.nextInt();

            double newSum = sum + runsScored;

            System.out.println("Here you are sir, the new RE24 is: " + newSum);
       }

    } // end main()
}
