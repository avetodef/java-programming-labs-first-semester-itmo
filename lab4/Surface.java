package lab4;
//интерфейс определяет что у всех имплементирующих его классов будет метод возвращающий описание хождения
public interface Surface {
    //метод возвращающий описание хождения
    String describe();
}

//описывает хождение по лунной дорожке
class MoonlightPath implements Surface {
    private final String name = "лунная дорожка";

    //возвращает сообщение что кто-то был отчетливо виден на лунной дорожке
    public String describe() {
        return "был отчетливо виден на " + name;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object object) {//метод сравнения двух объектов
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    //переопределение метода toString(возвращает имя объекта)
    @Override
    public String toString() {
        return name;
    }

    //переопределение метода hashCode (возвращает хешкод* 2^82589933 -1)
    @Override
    public int hashCode() {
        return (int) (name.hashCode() * (Math.pow(2, 82589933) - 1));

    }
}
//описывает хождение по берегу
class Coast implements Surface {
    private final String name = "берег";

    //возвращает сообщение о том что кто-то зашагал по берегу
    public String describe() {
        return "зашагал по " + name;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object object) {//метод сравнения двух объектов
        if (this == object) return true;
        return !(object == null || getClass() != object.getClass());

    }

    //переопределение метода toString(возвращает имя объекта)
    @Override
    public String toString() {
        return name;
    }

    //переопределение метода hashCode (возвращает хешкод* 2^82589933 -1)
    @Override
    public int hashCode() {
        return (int) (name.hashCode() * (Math.pow(2, 82589933) - 1));

    }
}


//✨✨✨✨описывает воду✨✨✨✨
class Water implements Surface {
    private final String name = "вода";

    //возвращает действие воды (спад воды)
    public String describe() {
        return name + " наконец-то начала спадать";
    }
}
