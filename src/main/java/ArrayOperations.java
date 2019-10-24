/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class ArrayOperations {
    public static double getTotal( double [ ] numbers ){
        double total = 0;
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++ ){
            total = total + numbers[ currentNumbersIndex ];
        }
        return total;
    }
    public static double getAverage( double [] numbers){
        double numbersTotal = getTotal( numbers);
        int numberOfItemsInNumberArray = numbers.length;
        double average = numbersTotal / numberOfItemsInNumberArray;
        return average;
    }
    
    public static double getHighest( double [ ] numbers){
        double highestNumbers = numbers[ 0 ];
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++ ){
            if( numbers[ currentNumbersIndex ] > highestNumbers){
                highestNumbers = numbers[ currentNumbersIndex ];
            }
        }
        return highestNumbers;
    }
    
    public static double getLowest( double [ ] numbers ){
        double lowestNumber= numbers[ 0 ];
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++){
            if( numbers[ currentNumbersIndex ] < lowestNumber){
                lowestNumber = numbers[ currentNumbersIndex ];
            }
        }
        return lowestNumber;
    }
       public static void main(String[] args) {
        double [ ] numbers = { 3.4, 3.7, 1.4, 4.5, 3.1};
        System.out.println( "Total: " + getTotal( numbers ) + "\n" +
                            "Average: " + String.format( "%.2f", getAverage( numbers )) + "\n" +
                            "Highest: " + getHighest( numbers) + 
                            "\n Lowest: " + getLowest( numbers ));
    }
}

