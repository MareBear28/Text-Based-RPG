
import java.util.Random;
public interface Magical
{
  public static final String MAGIC_MENU = "1. Magic Missile\n2. Fireball\n3. Thunderclap";

  /**
    Magical spell methods are constructed so that other classes
    can use these methods.
    @param: object of Entity
  */
  public String magicMissile(Entity e);
  public String fireball(Entity e);
  public String thunderclap(Entity e);
}