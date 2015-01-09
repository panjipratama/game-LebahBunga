import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanScore extends Actor
{
    private GreenfootImage img1=new GreenfootImage(205,100);
    private Waktu waktu = new Waktu();
    private int timer;
    /**
     * Act - do whatever the PapanScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        img1.clear();
        buatPapanScore();
    }    
    public PapanScore(){
        buatPapanScore();
        setImage(img1);
        
    }
    private void buatPapanScore(){
        img1.setColor(java.awt.Color.BLUE);
        img1.drawRect(0,0,201,50);
        img1.setColor(java.awt.Color.YELLOW);
        img1.fillRect(1,1,198,48);
        
        img1.setColor(java.awt.Color.BLACK);
        //img1.drawString("SCORE :",10,10);
        img1.drawString("  Bunga :" + Lebah.bungaCounter,2,15);
        timer++;
        if(timer>=100){
            timer=0;
            waktu.detikUp();
    }
            
        img1.setColor(java.awt.Color.BLUE);
        img1.drawString("Lama Main :" + waktu.toString(),2,39);
        if(waktu.getMenit()>=2){
            if(Lebah.bungaCounter>=10)
            {
                getWorld().addObject(new EndingMessage(true,"Oke.."), 300, 100);
            }
        }
    }
}
