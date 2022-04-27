package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super(name, level);
        this.setMove(new Facade(),new Double_Team());
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(28, 25, 25, 45, 35, 40);
    }

}
