/*package lab3;
import java.util.Scanner;
import lab4.EmptyPipeException;

public class Snusmumrikk {
    private static final String name = "Снусмумрик";
    private final SmokingPipe pipe;
    Scanner scanner;

    public Snusmumrik(SmokingPipe pipe) {
        this.pipe = pipe;
    }

    public String addNothing() {
        return name + " больше ничего не добавил";
    }

    public String sit(Interactive place) {
        return name + " " + place.interact();
    }

    public String clearPipe() {
        return name + " " + pipe.interact();
    }

    public String peek(Interactive place) {
        return name + " наклонился и " + place.interact();
    }

    public String laugh() {
        return name + " тихонько рассмеялся";
    }

    public String fillPipe(Interactive tobacco) {
        return name + " " + pipe.fill(tobacco);
    }



    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Snusmumrik snusmumrik = (Snusmumrik) object;

        return pipe.equals(snusmumrik.pipe);
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + pipe.hashCode();
    }

} */