package Aircraft;

public abstract class AircraftFactory
{
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        if((latitude >= 0) && (longitude >= 0) && (height >= 0))
        {
            String aircraftName;

            Coordinates coordinates = new Coordinates(longitude,latitude,height);
            aircraftName = type.toUpperCase();
            switch (aircraftName)
            {
                case "BALOON":
                    return new Baloon(name,coordinates);
                case "JETPLANE":
                    return new JetPlane(name, coordinates);
                case "HELICOPTER":
                    return new Helicopter(name, coordinates);
                    default:
                        System.err.println("\n***Invalid Flyable error, only baloon,jetplane,helicopter***".toUpperCase());
                        System.exit(1);
                        return null;
            }
        }
        System.err.println("\n***Invalid coordinate error, only Positive numeric values are accepted***".toUpperCase());
        System.exit(1);
        return null;
    }
}
