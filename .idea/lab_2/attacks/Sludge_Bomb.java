package lab_2.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Sludge_Bomb extends SpecialMove {

    public Sludge_Bomb ()
    { super(Type.POISON, 90, 100); }

    @Override

    protected void applyOppDamage(Pokemon p , double damage){
        p.setMod(Stat.HP, (int) damage);
        if (Math.random() <= 0.3){
            Effect.poison(p);
        }
    }

    @Override

    protected String describe (){
        return "Uses Sludge Bomb";
    }
}
