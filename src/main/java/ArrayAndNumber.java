/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class ArrayAndNumber 
{
  public static int [] greaterNumbers( int [] integerArray, int number ){
      int [ ] greaterNumbersToBeReturned = new int [ integerArray.length ];
      int greaterNumbersToBeReturnedIndex = 0;
      
      for( int index = 0; index < integerArray.length; index++ ) {
          if( integerArray[ index ] > number) {
              greaterNumbersToBeReturned[ greaterNumbersToBeReturnedIndex ] = integerArray[ index ];
              greaterNumbersToBeReturnedIndex = greaterNumbersToBeReturnedIndex + 1;
      }
     }
      return greaterNumbersToBeReturned;
  }
  public static void main( String [] args){
      int [ ] integerArray= { 1, 2, 3, 4, 5, 6, 7, 8};
      int number = 3;
      int [ ] greaterNumbersReturned = greaterNumbers( integerArray, number );
      
      for( int index = 0; index < greaterNumbersReturned.length; index++ ){
          if( greaterNumbersReturned[ index ] !=0 ){
          System.out.println( greaterNumbersReturned[ index ] + " ");
      }
    }
  }
}
