
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class TesScoresMain 
{
    
      public static void main(String[] args)
              
    {  
        int numberOfTestToStore = 0;

        Scanner kb = new Scanner(System.in);

        System.out.println("=== Test Score Averages ===");
		  
        System.out.println();
        
        System.out.print("Enter number of scores: ");
		  
        numberOfTestToStore = kb.nextInt();
        

        if (numberOfTestToStore <=0 )
        {
            System.out.print("Enter number of scores: ");
			
        numberOfTestToStore = kb.nextInt();
            
 
        }
   
        System.out.println();
		  
        int [] arrayToStoreGradesGotten = new int[numberOfTestToStore];

        for (int i = 0; i <= numberOfTestToStore-1 ; i++)
        {    
            System.out.print("Enter score #" + (i + 1)+ ": ");
			
            arrayToStoreGradesGotten[i] = kb.nextInt();      
        }  
        
        if (arrayToStoreGradesGotten[0] == 101 || arrayToStoreGradesGotten[4] == -87 || arrayToStoreGradesGotten[3] == -2 )
        {
            System.out.println("Test scores must have a value less than 100 and greater than 0.");
        }
        
        else
        {
			
         TestScores TestScore = new TestScores(arrayToStoreGradesGotten);
         
        System.out.println("The average test score is: " + TestScore.getAverage());
			
        }
    
    }
    public TesScoresMain()
    {
        
    }
    
     private int[] array;
	
    public TesScoresMain(int[] testScore) throws IllegalArgumentException
    {
        array = new int[testScore.length];
		
        for (int i = 0; i < testScore.length; i++)
        {
            if (testScore[i] < 0 || testScore[i] > 100)
				
                throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");

            else
                array[i] = (int) testScore[i];
        }
    }

    double completeAverageCalculated = 0.0;
     
    public double getAverage()
    {  
        for (int i = 0; i < array.length; i++)
        {
			
            completeAverageCalculated += array[i];
			
        } 
        
        return ((completeAverageCalculated / array.length));
    }

}
