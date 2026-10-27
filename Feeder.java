public class Feeder
{
    private int currentFood = 2400;
    

    public void simulateOneDay(int numBirds)
    {
        if (Math.random() < 0.05)
        {
            currentFood = 0;
        }
        else
        {
            currentFood -= numBirds * (int) ((Math.random() * (50 - 10 + 1) + 10));
            if (currentFood < 0)
            {
                currentFood = 0;
            }
        }
    }

    public int simulateManyDays(int numBirds, int numDays)
    {
        for (int i = 0; i < numDays; i++)
        {
            if (currentFood == 0)
            {
                return(i);
            }
            simulateOneDay(numBirds);
        }
        return numDays;
    }

    public int getCurrentFood()
    {
        return currentFood;
    }

    public void setCurrentFood(int currentFood)
    {
        this.currentFood = currentFood;
    }
}