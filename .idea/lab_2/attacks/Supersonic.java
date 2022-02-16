package lab_2.attacks;
import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove{
    public Supersonic()
    { super(Type.NORMAL, 0, 55); }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
    @Override

    protected String describe()  {
        return "Uses Supersonic";
    }
}
