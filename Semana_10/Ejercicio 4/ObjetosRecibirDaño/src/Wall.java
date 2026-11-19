public class Wall implements Damageable{

    private int durability;

    public Wall(int durability){
        this.durability = durability;
    }

    public int getDurability(){
        return durability;
    }

    @Override 
    public void applyDamage(int points){
        durability = points;
        if(durability < points){
            System.out.println("La pared se ha roto");
        }
    }
}
