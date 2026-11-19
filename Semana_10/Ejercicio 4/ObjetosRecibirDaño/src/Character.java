public class Character implements Damageable{
    int health;
    public Character(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    @Override 
    public void applyDamage(int points){
        health = points;
        if(health < points){
            System.out.println("El personaje ha muerto");
        }
    }

    public void setHealth(int health){
        this.health=health;
    }
}
