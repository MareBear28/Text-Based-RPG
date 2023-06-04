public class Orc extends Enemy
{
  public Orc()
  {
    super("Orc", 4);
  }

  public String attack(Entity e)
  {
    int atk = ( int ) (Math.random() * 4);
    e.takeDamage( atk );
    return this.getName() + " attacks " + e.getName() + " for " + atk + " damage.";
  }
}
