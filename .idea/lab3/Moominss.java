/*
package lab3;


import lab4.DirectionException;

public abstract class Moominss {
    protected String name;

    protected Direction direction;

    protected Surface surface;

    public String walk() {
        return "";
    }

    @Override
    public boolean equals(Object object){
        if (this == object ) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Moomins moomin = (Moomins) object;

        if(!name.equals(moomin.name))
            return false;

        if(direction != moomin.direction)
            return false;

        return surface.equals(moomin.surface);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + direction.getName().hashCode() + surface.hashCode();
    }
}

class MumiTroll extends Moomins {
    {
        name = "Муми-тролль";
        direction = Direction.backward;
        surface = new Coast();
    }

    public String waitALittle() {
        return name + " немного подождал";
    }

    public String getOut(Interactive boat) {
        return name + " " + boat.interact();
    }

    @Override
    public String walk() {
        return name + " " + surface.describe() + " " + direction.getName();
    }

    public void checkDirection(Direction direction, String where) throws DirectionException {
        if (!where.equals("backward"))
            throw new DirectionException();
        else System.out.println("Муми-Тролль шел " + direction.getName());


    }

}

class Hemul extends Moomins {
    {
        name = "Хемуль";
        direction = Direction.forward;
        surface = new MoonlightPath();
    }

    @Override
    public String walk() {
        return name + " уверенно держал курс " + direction.getName();
    }

    public String wasSeen() {
        return name + " " + surface.describe();
    }

}


enum Direction {
    forward("вперед"), backward("назад");
    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
} */
