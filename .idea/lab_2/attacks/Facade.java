package lab_2.attacks;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Facade extends PhysicalMove {
    public Facade()
    { super(Type.NORMAL, 70, 100); }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status currentEffect = p.getCondition();
        if (currentEffect == Status.BURN   ||
                currentEffect == Status.POISON ||
                currentEffect == Status.PARALYZE)
            p.setMod(Stat.HP, (int) (damage * 2.0));
        else
            p.setMod(Stat.HP, (int) damage);
    }
    @Override
    protected String describe() {
        return "Uses Facade";
    }
}

