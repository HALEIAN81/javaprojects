import java.util.Random;

class IntegerArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
        
        for(int i = 0; i < 100; i++) 
        {
            Random nmbrRandom = new Random();
            int varNmbr = 1 + nmbrRandom.nextInt(800);
            arr [i] = varNmbr;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println( arr[i]);
        }
        
        int varNmbr = arr[0];
        int count = 0;
        for(int i = 0; i < 100; i++)
        {
            int varNmbr2 = arr[i];
            if(varNmbr < varNmbr2) {
               varNmbr = varNmbr2;
                count++;
            }
            else {
                count++; 
            }
        }
    System.out.println("The largest number in the array is: " + varNmbr + " The number of loop iterations: " + count);
        }
    }

