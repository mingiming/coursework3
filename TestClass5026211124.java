public class TestClass5026211124 {
    public static void main(String[] args) {
        //memanggil
        ComputeMethods5026211124 call = new ComputeMethods5026211124();

        // suhunya
        double suhuF = 100.4;
        double suhuC = call.fToc(suhuF);
        System.out.println("Temp in celsius is " + suhuC);
        
        // Hypotenuse
        double trigono = call.hypotenuse(6, 9);
        System.out.println("Hypotenuse is " + trigono);

        // dad00
        int sumDadu = call.roll();
        System.out.println("The sum of the dice values is " + sumDadu);
    }
}
