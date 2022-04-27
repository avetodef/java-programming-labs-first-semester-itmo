package lab_2.attacks;
import ru.ifmo.se.pokemon.*;

public class Rest extends  StatusMove{
    public Rest ()
    {super (Type.PSYCHIC, 0, 0); }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect.sleep(p);
        p.restore();
    }

    @Override
    protected String describe(){
        return "Uses Rest";
    }
}
