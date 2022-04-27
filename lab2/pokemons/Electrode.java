package pokemons;
import ru.ifmo.se.pokemon.*;

public class Electrode extends lab_2.pokemons.Voltorb {
    public Electrode(String name, int level){
        super(name, level);
        this.setMove(new lab_2.attacks.Sludge_Bomb(),new lab_2.attacks.Rest(),new lab_2.attacks.Double_Team(),new lab_2.attacks.Supersonic() );
        this.setType(Type.ELECTRIC);
        this.setStats(60, 50, 70, 80, 80, 150);
    }

}
