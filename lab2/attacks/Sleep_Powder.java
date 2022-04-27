package lab_2.attacks;
import ru.ifmo.se.pokemon.*;

public class Sleep_Powder extends StatusMove{

    public Sleep_Powder ()
    { super(Type.GRASS, 0, 75); }

    @Override

    protected void applyOppEffects(Pokemon p){
        Effect.sleep(p);
    }

    @Override

    protected String describe () {
        return "Uses Sleep Powder";
    }
}
