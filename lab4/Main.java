package lab4;
/*Он немного подождал, но поскольку Снусмумрик  ничего  больше
не добавил, Муми-тролль вылез из лодки и зашагал берегом назад.
     Снусмумрик сел на корму и осторожно выбил пепел  из  трубки,
он наклонился и выглянул из-за камышей.  Хемуль  уверенно  держал
курс вперед. Он был отчетливо виден на лунной дорожке. Снусмумрик
тихонько рассмеялся и начал набивать свою трубку.
     Наконец-то  вода  стала  спадать. */

import javax.annotation.Resource;

//главный класс, в нем история собирается и выводится + обрабатываются исключения
public class Main {
    //в методе создаются нужные объекты классов
    

        MumiTroll mumiTroll = new MumiTroll();
        Hemul hemul = new Hemul();
        SmokingPipe.Ash ash = new SmokingPipe.Ash();
        SmokingPipe pipe = new SmokingPipe(ash);
        Snusmumrik snusmumrik = new Snusmumrik(pipe);
        Boat boat = new Boat();
        Boat.Feed boatFeed = new Boat(). new Feed();
        Reed reeds = new Reed();
        Tobacco tobacco = new Tobacco();
        Water water = new Water();

        //лямбда-выражение которое возвращает союз "но"
        Conjunction conjunctionBut;
        conjunctionBut = () -> "Но ";

        //анонимный класс функция которого возвращает союз "поскольку"
        Conjunction conjunctionSince = new Conjunction() {
            @Override
            // функция которая возвращает союз "поскольку"
            public String addConjuction() {
                return "поскольку";
            }
        };


        //локальный класс, в котором вызываются функции + прописываются исключения
        class PrintStory {
            void printStory() {
                System.out.println(mumiTroll.waitALittle());
                System.out.println(conjunctionBut.addConjuction() + conjunctionSince.addConjuction() + " " + snusmumrik.addNothing());
                System.out.println(mumiTroll.getOut(boat));
                System.out.println(mumiTroll.walk());

                //блок в котором заключем код в котором может произойти исключение
                try {
                    mumiTroll.checkDirection(Direction.forward, "backward");
                }
                //обработка исключения
                catch (Exception exc1){
                    System.out.println(exc1.getMessage());
                }

                System.out.println(snusmumrik.sit(boatFeed));
                System.out.println(snusmumrik.clearPipe());
                System.out.println(snusmumrik.peek(reeds));
                System.out.println(hemul.walk());
                System.out.println(hemul.wasSeen());
                System.out.println(snusmumrik.laugh());
                System.out.println(snusmumrik.fillPipe(tobacco));

                //блок кода в котором может произойти исключение
                try {
                    tobacco.amount(tobacco,7);
                }
                //обработка исключения
                catch (Exception exc2){
                    System.out.println(exc2.getMessage());
                }

                System.out.println(water.describe());
            }
        }
        PrintStory printStory = new PrintStory();
        printStory.printStory();
    }
}