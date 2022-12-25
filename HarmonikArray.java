public class HarmonikArray {
    public static void main(String[] args) {
        double[]m={1.0,2.0,3.0,4.0,5.0};
        System.out.println(harmonik(m));
    }
    public static double harmonik(double[]array){
        double harmonicSeries = 0.0;
        for(int i = 0; i < array.length; i++) {
            harmonicSeries += (1/array[i]);
        }
        return array.length/harmonicSeries;
    }
}
