
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class EnemyGenerator{
  /**
  Method that randomly chooses an enemy from the arrayList, then randomly chooses whether that enemy is magical or not. Then makes a copy of the enemy from the arrayList to return.
  @return anotherEnemy, returns a copy of an enemy from the enemy arrayList
  @param returns a copy of an enemy from the enemy arrayList with Magical in the name to signify that it is a magical enemy
  */
  public Enemy generateEnemy( int level )
  {
    Enemy e;
    int rand = ( int ) (Math.random() * 4) + 1;
    if ( rand == 1 )
    {
      e = new Troll();
    }
    else if ( rand == 2 )
    {
      e = new Orc();
    }
    else if ( rand == 3 )
    {
      e = new Goblin();
    }
    else
      {
      e = new Froglok();
    }

    if ( level > 1 ){
      int num = ( int ) (Math.random() * 2) + 1;
      int loop = level - 1;
      if ( num == 1 ){
        for( int i = 0; i < loop; i++)
        {
          e = new Warlock( e );
        }
      }
      else{
        for( int i = 0; i < loop; i++)
        {
          e = new Warrior( e );
        }
      }
    }
    return e;
  }
}