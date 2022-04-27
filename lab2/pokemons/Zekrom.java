package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Zekrom extends Pokemon {
    public Zekrom(String name, int level){
        super(name, level);
        this.setMove(new Confide(), new Screech(), new Bite(), new Iron_Defence());
        this.setType(Type.DRAGON, Type.ELECTRIC);
        this.setStats(100, 150, 120, 120, 100, 90);
    }
}
