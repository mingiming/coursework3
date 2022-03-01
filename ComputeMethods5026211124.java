import java.util.Random;

public class ComputeMethods5026211124 {
    public double fToc(double suhuF){
        return 5.0/9.0*(suhuF - 32) ;    // C = 5/9*(F-32)
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));  // C = akar(a^2 +b^2)
    }

    public int roll(){
        Random dadu = new Random();
        int dadu1 = dadu.nextInt(6) + 1;    
        int dadu2 = dadu.nextInt(6) + 1;    
        int dadutotal = dadu1 + dadu2;     
        return dadutotal;
    }
}
