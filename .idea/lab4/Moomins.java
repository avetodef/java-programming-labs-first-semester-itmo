package lab4;
//абстрактный класс муми-троллей в котором прописаны их общие характеристики: имя, направление движения, поверхность, по которой ходят, метод возвращающий описание ходьбы
public abstract class Moomins {
    protected String name;

    protected Direction direction;

    protected Surface surface;
    //метод возвращающий описание ходьбы
    public String walk() {
        return "";
    }

    @Override //переопределение метода equals
    public boolean equals(Object object){
        if (this == object ) return true; //сравнение объектов
        if (object == null || getClass() != object.getClass()) return false;

        Moomins moomin = (Moomins) object;

        if(!name.equals(moomin.name))
            return false;

        if(direction != moomin.direction)
            return false;

        return surface.equals(moomin.surface);
    }
    //переопределение метода toString(вовзращает имя муми-тролля
    @Override
    public String toString() {
        return name;
    }
    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return name.hashCode() + direction.getName().hashCode() + surface.hashCode();
    }
}

//класс муми-тролля описывает все его характеристики + действия
class MumiTroll extends Moomins {
    //блок инициализации
    {
        name = "Муми-тролль";
        direction = Direction.backward;
        surface = new Coast();
    }
    //метод возвращающий что муми-тролль немного подождал
    public String waitALittle() {
        return name + " немного подождал";
    }
    //метод вовращающий что муми-тролль вылез из лодки
    public String getOut(Interactive boat) {
        return name + " " + boat.interact();
    }
    //переопределение метода walk. возвращает что муми-тролль ходит по берегу назад
    @Override
    public String walk() {
        return name + " " + surface.describe() + " " + direction.getName();
    }
    //описывает условие исключения checkDirection и что будет выведено при правильном вводе направления движения
    public void checkDirection(Direction direction, String where) throws DirectionException {
        if (!where.equals("backward"))
            throw new DirectionException();
        else System.out.println("Муми-Тролль шел " + direction.getName());
    }
}

//класс описывающий характеристики и действия Хемуля
class Hemul extends Moomins {
    //блок инициализации
    {
        name = "Хемуль";
        direction = Direction.forward;
        surface = new MoonlightPath();
    }
    //переопределение метода walk. возвращает что Хемуль уверенно держал курс вперед
    @Override
    public String walk() {
        return name + " уверенно держал курс " + direction.getName();
    }
    //метод возвращающий сообщение о том, что Хемуль был виден на лунной дорожке
    public String wasSeen() {
        return name + " " + surface.describe();
    }

}

//перечисление направлений движений
enum Direction {
    forward("вперед"), backward("назад");
    private String name;

    Direction(String name) {
        this.name = name;
    }
    //метод возвращающий имя направления: вперед или назад
    public String getName() {
        return name;
    }
}