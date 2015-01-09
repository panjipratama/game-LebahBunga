import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lebah extends Actor
{   public static int batuCounter=0;
    public static int bungaCounter=0;
    public static boolean maju = true;
    /**
     * Act - do whatever the Lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        if(isAtEdge())
        {
            turn(180);
            maju =!maju;
        }
        senggolBunga();
        bacaKB();
    }    
    public void senggolBunga() 
    {
        Actor getBunga = getOneIntersectingObject(Bunga.class);
        if(getBunga != null)
        {
            getWorld().removeObject(getBunga);
            //Greenfoot.playSound("hooray.wav");
            bungaCounter++;
            Bunga.JUMLAH_OBJ_BUNGA--;
        }
    }
    private void bacaKB(){
        int y=getY();
        if(Greenfoot.isKeyDown("up")){
           
            if(y>0)
            y -=3;
            else
            y=getWorld().getHeight()-3;
            setLocation(getX(),y);
        }
        if(Greenfoot.isKeyDown("down")){
            
            if(y<getWorld().getHeight()-3)
            y +=3;
            else
            y=0;
            setLocation(getX(),y);
        }
        if(Greenfoot.isKeyDown("space")){
            
            getWorld().addObject(new Bola(),getX(),getY());
            Greenfoot.playSound("shotgun-01.wav");
        }
    }
}
