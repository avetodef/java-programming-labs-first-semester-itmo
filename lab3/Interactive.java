package lab3;

import lab4.EmptyPipeException;

import java.util.ArrayList;


public interface Interactive {
    String interact();
}

class SmokingPipe implements  Interactive {

    private final ArrayList<Interactive> contents = new ArrayList<>();

    public SmokingPipe(Interactive ash) {
        contents.add(ash);
    }

    public static final String name = "трубка";

    public SmokingPipe() {}

    public String interact() {
        String msg = contents.get(0).interact();
        contents.clear();
        return msg + " из " + name;

    }

    public String fill(Interactive tobacco) {
        contents.add(tobacco);
        return tobacco.interact() + " свою " + SmokingPipe.name ;
    }

    class Ash implements Interactive {

        private final String name = "пепел";


        public String interact() {
            return "осторожно выбил " + name;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            return !(object == null || getClass() != object.getClass());

        }

        @Override
        public String toString() { return name; }
        @Override
        public int hashCode() { return name.hashCode() * 31; }

    }

      @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31;
    }

    public void contents(Ash ash, int amount) throws EmptyPipeException{
        if (amount > 0){
            System.out.println( "в " + SmokingPipe.name + " теперь есть табак");
        }
        else throw new EmptyPipeException();
    }

}


class Ash implements Interactive {

    private static final String name = "пепел";


    public String interact() {
        return "осторожно выбил " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }



    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 2;
    }


}

class Tobacco implements Interactive {

    private final String name = "табак";

    public String interact() {
        return "начал набивать " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31;
    }
}

class Boat implements Interactive {
    private final String name = "лодка";


    public String interact() {
        return "вылез из " + name;
    }

    static class Feed implements  Interactive {

        private final String name = "корма лодки";

        public String interact() {
            return "сел на " + name;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            return !(object == null || getClass() != object.getClass());

        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int hashCode() {
            return name.hashCode() * 2;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 2;
    }
}

class Feed implements  Interactive {

    private final String name = "корма лодки";

    public String interact() {
        return "сел на " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 2;
    }
}

class Reed implements  Interactive {
    private final String name = "камыш";

    public String interact() {
        return "выглянул из-за " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 2;
    }
}

