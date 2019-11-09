class juster
{  
static void printSinWave(int wave_height,  
                         int wave_length)   throws Exception
{ 
  
   int is = 1, os = 2; 
  
    for (int i = 1;  
             i <= wave_height; i++)  
    { 
  
        for (int j = 1;  
                 j <= wave_length; j++)  
        { 
  
            for (int k = 1; k <= os; k++)  
            { 
                System.out.printf(" "); 
            } 
  
            System.out.printf("*");
 
           Thread.sleep(1000);
  
            for (int k = 1; k <= is; k++)  
                System.out.printf(" ");      
  
            System.out.printf("*"); 
 
 
           Thread.sleep(1000);
            for (int k = 1; k <= os; k++)  
                System.out.printf(" "); 
              
            System.out.printf(" "); 
        
        } 
  
        os = (i + 1 != wave_height) ? 1 : 0; 
  
        is = (i + 1 != wave_height) ? 3 : 5; 
  
        System.out.printf("\n"); 
    } 
} 
  
public static void main(String[] args)  throws Exception
{ 
    int wave_height = 5, wave_length = 10; 
    printSinWave(wave_height, wave_length); 
} 
} 
  