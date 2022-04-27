package lab_2.attacks;
import ru.ifmo.se.pokemon.*;

public class Iron_Defence extends PhysicalMove {
    public Iron_Defence()
    {super (Type.STEEL, 0, 0); }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 2);
    }
    @Override

    protected String describe() {
        return "Uses Iron Defence";
    }
}
