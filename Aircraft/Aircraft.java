package avaj-launcher.aircraft;

public class Aircraft
{
    protected Long id;
    protected String name;
    protected Coordinates coordinates;
    private Long idCounter;

    protected Aircraft(String name, Coordinates coordinates)
    {
    }

    private Long nextId()
    {
    }
}