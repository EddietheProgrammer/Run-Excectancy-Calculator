public class RunExpectancyStats 
{
    private double empty = .645;
    private double emptyOneOut = .330;
    private double emptyTwoOut = .122;
    private double oneOnFirstNoOut = 1.086;
    private double oneOnFirstOneOut = .607;
    private double oneOnFirstTwoOut = .251;
    private double oneOnSecondNoOut = 1.373;
    private double oneOnSecondOneOut = .801;
    private double oneOnSecondTwoOut = .361;
    private double oneOnThirdNoOut = 1.730;
    private double oneOnThirdOneOut = 1.083;
    private double oneOnThirdTwoOut = .433;
    private double firstAndSecondNoOut = 1.790;
    private double firstAndSecondOneOut = 1.068;
    private double firstAndSecondTwoOut = .489;
    private double firstAndThirdNoOut = 2.090;
    private double firstAndThirdOneOut = 1.338;
    private double firstAndThirdTwoOut = .573;
    private double secondAndThirdNoOut = 2.347;
    private double secondAndThirdOneOut = 1.508;
    private double secondAndThirdTwoOut = .654;
    private double basesLoadedNoOut = 2.769;
    private double basesLoadedOneOut = 1.813;
    private double basesLoadedTwoOut = .841;

    public RunExpectancyStats()
    {

    }
    public RunExpectancyStats(double one, double two, double three, double four, double five, double six, double seven, double eight, double nine, double ten, double eleven, double twelve, double thirteen, double fourteen, double fifteen, double sixteen, double seventeen, double eighteen, double nineteen, double twenty, double twentyone, double twentytwo, double twentythree, double twentyfour)
    {
        empty = one;
        emptyOneOut = two;
        emptyTwoOut = three;
        oneOnFirstNoOut= four;
        oneOnFirstOneOut = five;
        oneOnFirstTwoOut = six;
        oneOnSecondNoOut = seven;
        oneOnSecondOneOut = eight;
        oneOnSecondTwoOut = nine;
        oneOnThirdNoOut = ten;
        oneOnThirdOneOut = eleven;
        oneOnThirdTwoOut = twelve;
        firstAndSecondNoOut = thirteen;
        firstAndSecondOneOut = fourteen; 
        firstAndSecondTwoOut = fifteen;
        firstAndThirdNoOut = sixteen;
        firstAndThirdOneOut = seventeen;
        firstAndThirdTwoOut = eighteen;
        secondAndThirdNoOut = nineteen;
        secondAndThirdOneOut = twenty;
        secondAndThirdTwoOut= twentyone;
        basesLoadedNoOut = twentytwo;
        basesLoadedOneOut = twentythree;
        basesLoadedTwoOut = twentyfour;
    }

    public double getNum(int outs, int runnerLocation)
    {
        if (runnerLocation == 0)
        {
            if (outs == 0)
            {
                return empty;
            }
            else if (outs == 1)
            {
                return emptyOneOut;
            }
            else if (outs == 2)
            {
                return emptyTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 1)
        {
            if (outs == 0)
            {
                return oneOnFirstNoOut;
            }
            else if (outs == 1)
            {
                return oneOnFirstOneOut;
            }
            else if (outs == 2)
            {
                return oneOnFirstTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 2)
        {
            if (outs == 0)
            {
                return oneOnSecondNoOut;
            }
            else if (outs == 1)
            {
                return oneOnSecondOneOut;
            }
            else if (outs == 2)
            {
                return oneOnSecondTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 3)
        {
            if (outs == 0)
            {
                return oneOnThirdNoOut;
            }
            else if (outs == 1)
            {
                return oneOnThirdOneOut;
            }
            else if (outs == 2)
            {
                return oneOnThirdTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 12)
        {
            if (outs == 0)
            {
                return firstAndSecondNoOut;
            }
            else if (outs == 1)
            {
                return firstAndSecondOneOut;
            }
            else if (outs == 2)
            {
                return firstAndSecondTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 13)
        {
            if (outs == 0)
            {
                return firstAndThirdNoOut;
            }
            else if (outs == 1)
            {
                return firstAndThirdOneOut;
            }
            else if (outs == 2)
            {
                return firstAndThirdTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 23)
        {
            if (outs == 0)
            {
                return secondAndThirdNoOut;
            }
            else if (outs == 1)
            {
                return secondAndThirdOneOut;
            }
            else if (outs == 2)
            {
                return secondAndThirdTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else if (runnerLocation == 123)
        {
            if (outs == 0)
            {
                return basesLoadedNoOut;
            }
            else if (outs == 1)
            {
                return basesLoadedOneOut;
            }
            else if (outs == 2)
            {
                return basesLoadedTwoOut;
            }
            else 
            {
                return 0.0;
            }
        }
        else 
        {
           return 0.0;
        }
    }
}
