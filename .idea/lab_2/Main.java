package lab_2;
import ru.ifmo.se.pokemon.*;
import lab_2.pokemons.*;
import lab_2.attacks.*;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();
        battle.addAlly(new Zekrom("андрюха", 1) );
        battle.addAlly(new Kirlia("эндрю", 1) );
        battle.addAlly( new Electrode("андрей сергеич", 1) );
        battle.addFoe( new Ralts("сереба", 1));
        battle.addFoe(new  Voltorb("золотуха", 1));
        battle.addFoe(new Gardevoir("оловяшка", 1));
        battle.go();
    }
}
