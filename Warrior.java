public class Warrior extends EnemyDecorator
{
  public Warrior( Enemy e )
  {
    super( e, e.getName(), e.getHP() + 2);
  }

  public String attack( Entity e )
  {
    int atk = ( int ) (Math.random() * 3) + 1;
    e.takeDamage( atk );
    return "\n attacks " + e.getName() + " for an additional " + atk + " damage.";
  }

  public String getName()
  {
    return this.getName() + " Warrior";
  }
}
