package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Electrode extends Voltorb {
    public Electrode(String name, int level){
        super(name, level);
        this.setMove(new Sludge_Bomb(),new Rest(),new Double_Team(),new Supersonic() );
        this.setType(Type.ELECTRIC);
        this.setStats(60, 50, 70, 80, 80, 150);
    }

}
