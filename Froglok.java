public class Froglok extends Enemy
{
  public Froglok()
  {
    super( "Froglok", 3);
  }

  public String attack(Entity e)
  {
    int atk = ( int ) (Math.random() * 3) + 1;
    e.takeDamage( atk );
    return this.getName() + " attacks " + e.getName() + " for " + atk + " damage.";
  }
}
