/*package lab3;
import lab4.Conjunction;
import lab4.Nature;

public class Main implements lab4.Conjunction{


    @Override
    public String addConjuction() {
        return null;
    }

    public static void main(String[] args)  {

        MumiTroll mumiTroll = new MumiTroll();
        Hemul hemul = new Hemul();
        SmokingPipe.Ash ash = new SmokingPipe().new Ash();
        SmokingPipe pipe = new SmokingPipe(ash);
        Snusmumrik snusmumrik = new Snusmumrik(pipe);
        Boat boat = new Boat();
        Boat.Feed boatFeed = new Boat.Feed();
        Nature.Reed reeds = new Nature.Reed();
        Tobacco tobacco = new Tobacco();
        Nature.Water water = new Nature.Water();


        //лямбда
        Conjunction conjunctionBut;
        conjunctionBut = () -> "Но ";

        //анонимный
        Conjunction conjunctionSince = new Conjunction() {
            @Override
            public String addConjuction() {
                return "поскольку";
            }
        };

        class PrintStory {
            void printStory() {
                System.out.println(mumiTroll.waitALittle());
                System.out.println(conjunctionBut.addConjuction() + conjunctionSince.addConjuction() + " " + snusmumrik.addNothing());
                System.out.println(mumiTroll.getOut(boat));
                System.out.println(mumiTroll.walk());

                try {
                    mumiTroll.checkDirection(Direction.backward, "backward");
                }
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

                try {
                    pipe.contents(ash, -9);
                }
                catch (Exception exc2){
                    System.out.println(exc2.getMessage());
                }

                System.out.println(water.describe());
            }
        }
        PrintStory printStory = new PrintStory();
        printStory.printStory();
    }
} */