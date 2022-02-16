package lab_2.attacks;
import ru.ifmo.se.pokemon.*;

public class Screech extends PhysicalMove {
    public Screech()
    {super(Type.NORMAL, 0, 85); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -2);
    }
    @Override
    protected String describe() {
        return "Uses Screech";
    }

}
