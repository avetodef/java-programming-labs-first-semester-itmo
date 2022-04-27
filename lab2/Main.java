
import pokemons.Electrode;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();
        battle.addAlly(new lab_2.pokemons.Zekrom("андрюха", 1) );
        battle.addAlly(new lab_2.pokemons.Kirlia("эндрю", 1) );
        battle.addAlly( new Electrode("андрей сергеич", 1) );
        battle.addFoe( new lab_2.pokemons.Ralts("сереба", 1));
        battle.addFoe(new lab_2.pokemons.Voltorb("золотуха", 1));
        battle.addFoe(new lab_2.pokemons.Gardevoir("оловяшка", 1));
        battle.go();
    }
}
