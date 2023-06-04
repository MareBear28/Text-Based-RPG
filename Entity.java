
public abstract class Entity{
	//Public variables
	private String name;
	private int maxHp;
	private int hp;

	/**
    Constructor for Entity.
    @param n: name of character's name.
    @param mHp: maximum HP that a character can hold.
  */
	public Entity(String n, int mHp){
		name = n;
		maxHp = mHp;
		hp = maxHp;
	}
	public abstract String attack(Entity e);
	
/** 
 * The getName function returns the name of the entity it is being called with.
 * @return name of the entity
 */
	public String getName(){
		return name;
	}

/** 
 * The getHP function returns the hp of the entity it is being called with.
 * @return hp of the entity
 */
	public int getHP(){
		return hp;
	}

/** 
 * The getMaxHP function returns the max hp of the entity it is being called with.
 * @return max hp of the entity
 */
	public int getMaxHP(){
		return maxHp;
	}

/** 
 * The heal function takes in the parameter h and adds it to the hp of the entity it is being called for.
 * heal also checks if the hp is greater than the max hp and will set the hp to the max hp if it does surpass it.
 * @param int h the amount that is being healed to the entity.
 */
	public void heal(int h){
		hp = hp + h;
		if (hp > maxHp){
			hp = maxHp;
		}
	}

/** 
 * The takeDamage function takes in the parameter d and subtracts it from the hp of the entity it is being called for.
 * takeDamage also checks if the hp is less than the max hp and will set the hp to the max hp if it does go below it.
 * @param int d the amount that is being taken as damage to the entity.
 */
	public void takeDamage(int d){
		hp = hp - d;
		if (hp < 0){
			hp = 0;
		}
	}

/** 
 * The toString method returns an overidden print function.
 * @return name, hp, maxHp of the entity and formats them in a more organized method.
 */
	@Override
	public String toString(){
		return name+"\nHP: "+hp+"/"+maxHp;
	}
}