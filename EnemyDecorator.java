public abstract class EnemyDecorator extends Enemy
{
  private Enemy enemy;

  public EnemyDecorator( Enemy e, String n, int h)
  {
    super( n , h);
    enemy = e;
  }

  public String attack(Entity e)
  {
    return enemy.attack(e);
  }
}
