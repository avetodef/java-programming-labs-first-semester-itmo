package lab4;

import java.util.ArrayList;

//интерфейс определяет что у всех имплементирующих его классов будет вызов метода описания действия над объектом
public interface Interactive {
    //метод действия над объектом
    String interact();
}

//описывает трубку Снусмумрика
class SmokingPipe implements  Interactive {

    private final ArrayList<Interactive> contents = new ArrayList<>();

    //конструктор создает объект трубки и добавляет ash в contents
    public SmokingPipe(Interactive ash) {
        contents.add(ash);
    }

    public static final String name = "трубка";

    //метод, который возвращает действие опустошения трубки
    public String interact() {
        String msg = contents.get(0).interact();
        contents.clear();
        return msg + " из " + name;

    }
    //метод, который возвращает сообщение о наполнении трубки
    public String fill(Interactive tobacco) {
        contents.add(tobacco);
        return tobacco.interact() + " свою " + SmokingPipe.name ;
    }

    //внутренний статический класс описывает действия над пеплом
    static public class Ash implements Interactive {

        private final String name = "пепел";

        //возвращает выбивание пепла из трубки
        public String interact() {
            return "осторожно выбил " + name;
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


//описывает действия произведенные над табаком
class Tobacco implements Interactive {

    private final String name = "табак";
    //возвращает описание набивания трубки табаком
    public String interact() {
        return "начал набивать " + name;
    }

    //метод, который возвращает сообщение если нет ошибки в вводе количества табака в трубке
    public void amount(Tobacco tobacco, int amount) throws EmptyPipeException{
        if (amount > 0){
            System.out.println( "в " + SmokingPipe.name + " теперь есть табак");
        }
        else throw new EmptyPipeException();
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

//описывает действия произведенные с лодкой
class Boat implements Interactive {
    private final String name = "лодка";

    //возвращает вылезание кого-либо из лодки
    public String interact() {
        return "вылез из " + name;
    }
    //вложенный класс кормы лодки, описывает все действия над кормой лодки
    class Feed implements Interactive{
        protected String name = "корма лодки";
        //метод возвращающий строку сообщающуюю о действиях с кормой лодки
        public String interact() { return "сел на " + name; }

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

//✨✨✨✨описывает камыш✨✨✨✨
class Reed implements Interactive {
    private final String name = "камыш";
    // возвращает действие выглядывания из-за камыша
    public String interact() {
        return "выглянул из-за " + name;
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

