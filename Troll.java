public class Troll extends Enemy
{
  public Troll()
  {
    super("Troll", 5);
  }

  public String attack(Entity e)
  {
    int atk = ( int ) (Math.random() * 5);
    e.takeDamage( atk );
    return " attacks " + e.getName() + " for " + atk + " damage.";
  }
}
