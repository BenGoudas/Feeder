public class Main
{
    public static void main(String[] args)
    {
        Feeder feeder = new Feeder();

        feeder.setCurrentFood(500);
        feeder.simulateOneDay(12);
        System.out.println("Test Case 1: " + feeder.getCurrentFood());

        feeder.setCurrentFood(1000);
        feeder.simulateOneDay(22);
        System.out.println("Test Case 2: " + feeder.getCurrentFood());

        feeder.setCurrentFood(100);
        feeder.simulateOneDay(5);
        System.out.println("Test Case 3: " + feeder.getCurrentFood());

        feeder.setCurrentFood(2400);
        int days = feeder.simulateManyDays(10, 4);
        System.out.println("Test Case 4: " + days);

        feeder.setCurrentFood(250);
        days = feeder.simulateManyDays(10, 5);
        System.out.println("Test Case 5: " + days);

        feeder.setCurrentFood(0);
        days = feeder.simulateManyDays(5, 10);
        System.out.println("Test Case 6: " + days);    


    }
}