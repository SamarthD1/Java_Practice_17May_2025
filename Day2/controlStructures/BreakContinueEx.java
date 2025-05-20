package Day2.controlStructures;

public class BreakContinueEx {
        public static void main(String[] args) {
            System.out.println("Even numbers from 1 to 10, stopping at number > 6:");
    
            for (int i = 1; i <= 10; i++) {
                
                // Skip odd numbers
                if (i % 2 != 0) {
                    continue; // skip this iteration
                }
    
                if (i > 6) {
                    break; // exit the loop
                }
    
                System.out.println(i);
            }
        }
    }
    
    

