package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Gardevoir extends lab_2.pokemons.Kirlia {
    public Gardevoir(String name, int level){
        super(name, level);
        this.setMove(new Facade(),new Double_Team(), new Sleep_Powder());
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(68, 65, 65, 125, 115, 80);
    }
}
//new Facade(),new Double_Team(), new Sleep_Powder
//new Confide(), new Screech(), new Bite(), new Iron_Defence()
//new Sludge_Bomb(),new Rest(),new Supersonic()