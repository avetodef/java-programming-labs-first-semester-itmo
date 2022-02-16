package lab4;
//исключение направления выводит ошибку если в main ввести неправильное направление движения муми-тролля
public class DirectionException extends Exception{
    //метод в котором написано, что будет выводить программа при исключении
    public DirectionException(){
        super("ОШИБКА! Муми-тролль зашагал НАЗАД, а не вперёд");
    }
}