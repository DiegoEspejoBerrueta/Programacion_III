public class Knight extends Character{
    
    public Knight (int health){
        super(health);
    }
    
    @Override 
    public void applyDamage(int points){
        int tmpPoints = (int) (points * 0.9);
        //setHealth(getHealth()-tmpPoints);
        //if(getHealth()<0){
        //    setHealth(0);
        //    System.out.println("Ha muerto el personaje");
        //}
        super.applyDamage(tmpPoints);
    }    
}
