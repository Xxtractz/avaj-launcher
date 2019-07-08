package Aircraft;

public class Aircraft {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;
    private static Long idCounter;

    protected Aircraft(String name ,Coordinates coordinates){

    }

    private long nextId(){
        return 0;
    }
}
