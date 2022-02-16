package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Gardevoir extends Kirlia {
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