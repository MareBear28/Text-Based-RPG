public class Goblin extends Enemy
{
  public Goblin()
  {
    super( "Goblin", 2);
  }


  public String attack(Entity e)
  {
    int atk = ( int ) (Math.random() * 2) + 1;
    e.takeDamage( atk );
    return this.getName() + " attacks " + e.getName() + " for " + atk + " damage.";
  }
}
