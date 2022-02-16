package lab4;

//описывает все действия Снусмумрика
public class Snusmumrik {

    private static final String name = "Снусмумрик";

    private final SmokingPipe pipe;
    //конструктор создания объекта трубки
    public Snusmumrik(SmokingPipe pipe) {
        this.pipe = pipe;
    }

    //возвращает что снусмумрик ничего не добавил
    public String addNothing() {
        return name + " больше ничего не добавил";
    }

    //возвращает строку, в которой написано, что снусмумрик сел на какое-то место (само место прописано в main)
    public String sit(Interactive place) {
        return name + " " + place.interact();
    }

    //возвращает строку о действиях с трубкой
    public String clearPipe() {
        return name + " " + pipe.interact();
    }

    //возвращает строку о выглядывания из-за какого-то места(само место прописано в main)
    public String peek(Interactive place) {
        return name + " наклонился и " + place.interact();
    }

    //возвращает строку о смехе
    public String laugh() {
        return name + " тихонько рассмеялся";
    }

    //возвращает строку описывающую действия с табаком
    public String fillPipe(Interactive tobacco) {
        return name + " " + pipe.fill(tobacco);
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