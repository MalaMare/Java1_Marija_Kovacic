
import media.Radio;
import media.Television;

public class Main {

    
    public static void main(String[] args) {
        
        Television tvN1 = new Television(5, 1, true);
        tvN1.showData();
       
        
        Radio rockRadio = new Radio(96.2, 000, 'A');
        rockRadio.showData();
        
        
    }
    
}
