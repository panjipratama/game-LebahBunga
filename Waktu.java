/**
 * Write a description of class Waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waktu
{
    //constanta attributes
    public static final int MAX_JAM=23;
    public static final int MAX_MENIT_DETIK = 59;
    //var attributes
    private int jam;
    private int menit;
    private int detik;
    
    /**
     * Constructor for objects of class Waktu
     */
    public Waktu()
    {
        jam=0;
        menit=0;
        detik=0;
    }
    public Waktu(int jam, int menit, int detik){
        //this.jam=jam; panggil setJam
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }
    //tambahkan setter dan getter method
    public void setJam(int jam){
        if((jam<0)||(jam>MAX_JAM)){
            System.err.print("JAM tidak boleh > 23 atau < 0");
            this.jam=0;
        }else{
            this.jam=jam;
        }
    }
    
    public void setMenit(int menit){
    if((menit<0)||(menit>MAX_MENIT_DETIK)){
            System.err.print("MENIT tidak boleh > 59 atau < 0");
            this.menit=0;
        }else{
            this.menit=menit;
        }
    }
    
    public void setDetik(int detik){
        if((detik<0)||(detik>MAX_MENIT_DETIK)){
            System.err.print("DETIK tidak boleh > 59 atau < 0");
            this.detik=0;
        }else{
            this.detik=detik;
        }
    }
    
    //menambah jam
    public void jamUp(){
        if(jam==MAX_JAM)
            jam=0;
        else
            jam++;
    }
    
    //mengurangi jam
    public void jamDown(){
        jam--;
    }
    
    public void menitUp(){
        if(menit==MAX_MENIT_DETIK)
        {
            menit=0;
            jamUp();
        }else
        menit++;
        
    }
    
    public void menitDown(){
        if(menit==0)
        {
            menit=59;
            jamDown();
        }else
        menit--;
    }
    
    public void detikUp(){
        if(detik==MAX_MENIT_DETIK){
            detik=0;
            menitUp();
        }
        else
        detik++;
    }
    
    public void detikDown(){
        if(detik==0){
            detik=59;
            menitDown();
        }
        else
        detik--;
    }
    /**
     * return String yang berisi data jam:menit:detik
     * 00:00:00
     */
    public String toString(){
        return jam+":"+menit+":"+detik;
    }
    
    public Waktu selisih(Waktu waktu2){
        //ubah nilai waktu ke detik
        return toWaktu(toDetik()-waktu2.toDetik());
    }
    /**
     * method untuk mengubah jam ke detik
     * 
     */
    private long toDetik(){
        return detik+(60*menit)+(60*60*jam);
    }
    
    //method untuk mengubah detik ke Waktu
    public Waktu toWaktu(long detik){
        int j=(int)detik/3600;
        int m=(int)(detik%3600)/60;
        int d=(int)detik%60;
        return new Waktu(j,m,d);
    }
    public int getMenit(){
        return menit;
    }
}
