
//Point.java - represents player's position
public class Point
{
  //Represents player's position
  public int x;
  public int y;

  /**
    Constructor position/location on the map or character's position.
    @param x: x-coordinate of a map or character's position.
    @param y: y-coordinate of a map or character's position.
  */
  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /** 
    Sets the x-coordinate with a different value.
    @param x: x-coordinate
  */
  public void setX(int x)
  {
    this.x = x;
  }

  /** 
    Sets the y-coordinate with a different value.
    @param y: y-coordinate
  */
  public void setY(int y)
  {
    this.y = y;
  }
}
