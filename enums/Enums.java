package enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        Day_of_Week.getQuote(input1);


}

enum Day_of_Week implements Comparator<Day_of_Week> {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    private String quote;

    private Day_of_Week(String quote){
        this.quote = quote;
    }
    public String quote(){
        return quote;

    }

    @Override
    public int compare(Day_of_Week o1, Day_of_Week o2) {
        if (o1.ordinal() > o2.ordinal()) {return 1;}
        else if (o1.ordinal() < o2.ordinal()){return -1;}
        else return 0;
    }

    public static void getQuote(String input1){
        input1 = input1.toUpperCase();
        String[] input_array = input1.split(" ");
        Day_of_Week[] output_array = new Day_of_Week[input_array.length];
        for (int i = 0; i < output_array.length ; i++) {
            output_array[i] = Day_of_Week.valueOf(input_array[i].toUpperCase());

        }
        Arrays.sort(output_array);
        System.out.println(output_array[output_array.length-1].quote());
    }

    }
}
