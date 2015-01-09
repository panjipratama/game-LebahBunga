import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
    public int jmlBunga;
    public static boolean MULAI=false;
    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Lebah lebah = new Lebah();
        addObject(lebah, 78, 275);

        Bunga bunga = new Bunga();
        addObject(bunga, 306, 205);

        Lebah lebah2 = new Lebah();
        addObject(lebah2, 169, 95);
        removeObject(lebah2);
        Batu batu = new Batu();
        addObject(batu, 523, 200);
        PapanScore papanscore = new PapanScore();
        addObject(papanscore, 523, 80);
        papanscore.setLocation(30, 65);
    }
    public void started(){
        MULAI=true;
        SplashScreen sc=new SplashScreen();
        addObject(sc,300,200);
        for(int i=0;i<1000;i++);
        
        
    }
    public void act(){
        //int tunggu=Greenfoot.getRandomNumber(2000);
        if(Bunga.JUMLAH_OBJ_BUNGA<10){
        int x=(Greenfoot.getRandomNumber(600)<200?150:500);
        int y=Greenfoot.getRandomNumber(400);
        addObject(new Bunga(), x, y);
        Bunga.JUMLAH_OBJ_BUNGA++;
        if(getObjects(Batu.class).size()<1)
        addObject(new Batu(), x, y);
        
    }
    if(Lebah.batuCounter>=3)
    {
            addObject(new EndingMessage(false,"ANDA KALAH !"), 300, 100);
            Greenfoot.stop();
            MULAI=false;
        }
       
    }
    
    public void stopped(){
        Lebah.bungaCounter=0;
        Lebah.batuCounter=0;
    }
}
