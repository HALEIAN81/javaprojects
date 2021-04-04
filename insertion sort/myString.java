import java.util.ArrayList;

public class myString {

    public static void main(String[] args) {
        String s="My String is the best string"; //declare String s
        String sbstring = s.substring(0, 28); // setup substring
        String t="What about my string?"; //string for comparison to s
        s = s.concat(" for this purpose"); //contains s which is the string that is concatenated to the end of this string

        if( s.compareTo( t ) < 0 ) { //provide an argument for the compareTo method
            System.out.println ( s + " is less than " + t);
        } else if(s.compareTo( t ) == 0 ) {
            System.out.println( s + "is equal to " + t);
        } else if (s.compareTo( t ) > 0 ){
            System.out.println( s + "is greater than" + t );
        }
        System.out.println(s);
        System.out.println(sbstring + " 0-38 ");
        int curr_length=0; //declare curr_length
        
        for(int i=0; i<s.length();i++) { //for loop for creating array from strings
            if(s.charAt(i)!=' ') {
                curr_length++;
        ArrayList in=new ArrayList();
        in.ensureCapacity(i); 

        boolean isEqualString = s.equals(t); //boolean for comparing s to t
             }
        }

System.out.println(s.toUpperCase()); 
System.out.println("Count of my string characters: " + curr_length);
System.out.println(Integer.toString(1));
    }  
}
