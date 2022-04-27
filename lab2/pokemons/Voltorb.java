package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Voltorb extends Pokemon{
    public Voltorb(String name, int level){
        super(name, level);
        this.setMove(new Sludge_Bomb(),new Rest(),new Double_Team());
        this.setType(Type.ELECTRIC);
        this.setStats(40, 30, 50, 55, 55, 100);
    }
}
