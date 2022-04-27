package lab3;

public interface Surfacee {
    String describe();
}

class MoonlightPath implements Surface {
    private final String name = "лунная дорожка";

    public String describe() {
        return "был отчетливо виден на " + name;
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

class Coast implements Surface {
    private final  String name = "берег";

    public String describe() {
        return "зашагал по " + name;
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
