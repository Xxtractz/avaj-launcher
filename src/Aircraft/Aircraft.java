package Aircraft;

import Simulator.Logger;

public abstract class Aircraft {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;
    private static Long idCounter  = 0L;
    protected Logger logger = new Logger();

    protected Aircraft(String name ,Coordinates coordinates){
        this.id = nextId();
        this.coordinates = coordinates;
        this.name= name;
    }

    private Long nextId(){
        return ++this.idCounter;
    }
}
