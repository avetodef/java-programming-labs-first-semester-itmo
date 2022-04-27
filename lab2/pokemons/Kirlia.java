package lab_2.pokemons;
import ru.ifmo.se.pokemon.*;
import lab_2.attacks.*;

public class Kirlia extends Ralts{
    public Kirlia(String name, int level){
        super(name, level);
        this.setMove(new Facade(),new Double_Team(), new Sleep_Powder());
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(38, 35, 35, 65, 55, 50);
    }
}
