
package media;


public class Radio {
    
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    
    public Radio() {
        
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'A';
        
    }
    
    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
    
    public void showData() {
        System.out.println("Radio");
        System.out.println("Fm: " + getFmFrequency());
        System.out.println("Am: " + getAmFrequency());
        System.out.println("Band: " + getBand());
        System.out.println();
    }
    
        
}
    

