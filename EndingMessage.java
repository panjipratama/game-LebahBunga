import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingMessage extends Actor
{
    private GreenfootImage gambar=new GreenfootImage(350,100);
    
    public EndingMessage(Boolean menang, String pesan){
        gambar.setColor(new java.awt.Color(122,25,111));
        gambar.fill();
        
        if(menang)
            gambar.drawImage(new GreenfootImage("smiley2.png"), 10, 10);
        
        else
            gambar.drawImage(new GreenfootImage("smiley5.png"), 10, 10);
        gambar.setColor(new java.awt.Color(250,155,255));
        gambar.setFont(new java.awt.Font(gambar.getFont().
            getFontName(),
            gambar.getFont().getStyle(),40));
        gambar.drawString(pesan,65,40);
        setImage(gambar);
        
    }
    /**
     * Act - do whatever the EndingMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Greenfoot.delay(100);
        //getWorld().removeObject(this);
        //Greenfoot.delay(0);
        if(Dunia.MULAI)
            getWorld().removeObject(this);
    }    
    
}
