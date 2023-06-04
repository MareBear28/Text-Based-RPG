public class Warlock extends EnemyDecorator implements Magical
{
  public Warlock( Enemy e )
  {
    super( e, e.getName(), e.getHP() + 1);
  }
  /**
    Method of magicMissile attack which does random damage in a range and applies that damage to the entity passed in.
    @param: object of Entity
    @return: a string indicating the attack and the damage they did to the entity with their attack
    */
  public String magicMissile(Entity e)
  {
    int randDamage = (int)(Math.random() * 2);
    e.takeDamage(randDamage);
    return " launches a Magic Missile at " + e.getName() + " doing an additional " + "" + randDamage + " damage";
  }

  /**
    Method of fireball attack which does random damage in a range and applies that damage to the entity passed in.
    @param: object of Entity
    @return: a string indicating the attack and the damage they did to the entity with their attack
    */
  public String fireball(Entity e)
  {
    int randDamage = (int)(Math.random() * 3);
    e.takeDamage(randDamage);
    return" launches a Fireball at " + e.getName() + " doing an additional " + "" + randDamage + " damage";
  }

  /**
    Method of thunderclap attack which does random damage in a range and applies that damage to the entity passed in.
    @param: object of Entity
    @return: a string indicating the attack and the damage they did to the entity with their attack
    */
  public String thunderclap(Entity e)
  {
    int randDamage = (int)(Math.random() * 3) + 1;
    e.takeDamage(randDamage);
    return " slaps the " + e.getName() + " with thundering hands doing an additional " + "" +randDamage + " damage";
  }

  public String attack( Entity e )
  {
    int randomSpell = (int)(Math.random() * 3) + 1;

    if (randomSpell == 1)
    {
      return magicMissile(e);
    }

    else if (randomSpell == 2)
    {
      return fireball(e);
    }

    else
    {
      return thunderclap(e);
    }
  }

  public String getName()
  {
    return this.getName() + " Warlock";
  }
}
