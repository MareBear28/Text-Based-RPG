
public abstract class Enemy extends Entity
{
  /**
  Contructor that creates an enemy using the Entity's contructor
  @param n: name of the Enemy
  @param mHP: maximum HP that enemy holds.
  */
  public Enemy(String n, int mHP)
  { 
    super( n , mHP);
  }

}

  /**
    public interface Component 
    {
      public voidoperation();
    }
    public class ComponentA implements Component 
    {
      public void operation( )
      {
        System.out.print(“CompA->”);
      }
    }
    public abstract Decorator implements Component
    {
      private Component comp;
      public Decorator( Component c ) 
      {
        comp = c;
      }
      public void operation()
      {
        comp.operation();
      }
    }
    public class DecoratorA extends Decorator
    {
      public DecoratorA( Component c ) 
      {
        super( c );
      }
      public void operation()
      {
        super.operation();
        additionalOperation();
      }
      public void additionalOperation()
      {
        System.out.print(“DecorA->”);
      }
    }
    public class Main
    {
      public static void main( String [] args ) 
      {
        Component a = new DecoratorA(new ComponentA() );
        a.operation();
      }
    }
    /*
     Output:CompA->DecorA->
     */
