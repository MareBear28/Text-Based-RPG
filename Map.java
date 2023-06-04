
import java.io.*;
import java.util.Scanner;
public class Map{
  final int ROWS = 5;
  final int COL = 5;
  private char [][] map = new char[ROWS][COL];
  private boolean [][] revealed = new boolean[ROWS][COL];
  private static Map instance = null;
  
  /**
  Contructor for Map class, fills the revealed array with false
  */
  public Map(){
    for( int i = 0; i < revealed.length; i++ ){
      for(int j = 0; j < revealed[0].length; j++){
        revealed[i][j] = false;
      }
    }
  }

  public static Map getInstance()
  {
    if ( instance == null )
    {
      instance = new Map();
    }
    return instance;
  }

  /**
  Method that reads the map from a txt file and inputs the char from that txt to the map array.
  @param mapNum, takes in a integer to signify which map file to read from
  */
  public void loadMap(int mapNum){
    final int ROWS = 5;
    final int COL = 5;
    char[][] dummy_map = new char[ROWS][COL];
    int row = 0;
    Scanner read;
    
    try{
      if (mapNum == 1){
        read = new Scanner(new File("Map1.txt"));
      }
      else if (mapNum == 2){
        read = new Scanner(new File("Map2.txt"));
      }
      else{
        read = new Scanner(new File("Map3.txt"));
      }
      while(read.hasNext()){
        String line = read.nextLine();
        String [] rows = line.split(" ");
        for (int i = 0; i < dummy_map.length; i++){
          dummy_map[i] = rows[i].toCharArray();
        }
        int col = 0;
        for (char[] char_array : dummy_map){
          for (char c: char_array){
            map[row][col] = c;
            col++;
          }
        }
        row++;
      }
      revealed = new boolean[5][5];
      read.close();
    }
    catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }
  
  /**
  Method that returns a char at a specific location form the map array. If the location is out of bounds then it returns a x
  @param p, a point used to find the location of the char to return
  @return location, returns a char of the map array
  */
  public char getCharAtLoc(Point p){
    if (p.y < 0 || p.y > 4 || p.x < 0 || p.x > 4){
      return 'x';
    }
    else{
      char location = map[p.y][p.x];
      return location;
    }   
  }
  
  /**
  ToString method that returns a string of the map. Shows unexplored areas with x, where the hero is with *.
  @param p, point of where the hero is so we can display a * where the hero location is
  @return display, returns a string of the map to display
  */
  public String mapToString(Point p){
    String display = "";
    int row = 0;
    while (row != 5){
      for (int column = 0; column < 5; column++){
        if (row == p.y &&  column == p.x){
          display += "* ";
        }
        else if (revealed[row][column] == false){
          display += "x ";
        }
        else {
          String z = String.valueOf(map[row][column]);
          display += z + " ";
        }
      }
      display += "\n";
      row++;
    }
    return display;
  }
  
  /**
  Method that iterates through the map array to find where the start is
  @return p, returns a point of the location of the start
  */
  public Point findStart(){
    Point p = new Point(0,0);
    for( int i = 0; i < map.length; i++ ){
      for(int j = 0; j < map[0].length; j++){
        if (map[i][j] == 's'){
          p = new Point(j, i);
        }
      }
    }
    return p;
  }

  /**
  Method that changes a location of the revealed array to true
  @param p, point used to find specific location to make true in revealed array
  */
  public void reveal(Point p){
    revealed[p.y][p.x] = true;
  }

  /**
  Method that changes a char at a specific location to n but keeps s on the map. Signifies visited locations.
  @param p, point used to get location of char to change
  */
  public void removeCharAtLoc(Point p){
    if (map[p.y][p.x] == 's'){
      map[p.y][p.x] = 's';
    }
    else{
      map[p.y][p.x] = 'n';
    }
  }
}