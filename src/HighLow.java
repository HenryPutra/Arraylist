import java.util.Arrays;
import java.util.stream.Stream;

public class HighLow {
    public static String Highlow (String str){

        String[]Number = str.split(" ");
        int[] myNumber = new int[Number.length];
        for (int index = 0; index < Number.length; index++){
            myNumber[index] = Integer.parseInt(Number[index]);
        }
        Arrays.sort(myNumber);
        String max = String.valueOf(Arrays.stream(myNumber).max());
        String min = String.valueOf(Arrays.stream(myNumber).min());

        return max + " " +min;
    }
    public static String Highlow2 (String str){
        var stat =  Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();

        return stat.getMax() + " " + stat.getMin();
    }

    public static void main(String[] args) {
        System.out.println(Highlow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
