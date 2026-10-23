public class Feeder
{
    private int currentFood = 1000;

    public void simulateOneDay(int numBirds)
    {
        if (Math.random() < 0.05)
        {
            currentFood = 0;
        }
        else
        {
            currentFood -= numBirds * (int) ((Math.random() * (50 - 10 + 1) + 10));
        }
    }

    public int simulateManyDays(int numBirds, int numDays)
    {
        for (int i = 0; i < numDays; i++)
        {
            simulateOneDay(numBirds);
        }
        return getCurrentFood();
    }

    public int getCurrentFood()
    {
        return currentFood;
    }
}