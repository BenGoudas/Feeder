public class Main
{
    public static void main(String[] args)
    {
        Feeder feeder = new Feeder();
        feeder.simulateOneDay(10);
        System.out.println("Current food after one day: " + feeder.getCurrentFood());
    }
}