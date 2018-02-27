public class Test {
    public static void main(String[] args) {
        printTriangle(5, 3);
        printTriangle(7, 1); // For TESTING purpose only !!!!
    } 
    
    public static void printTriangle(int numberOfLines, int startingDigit){
        for(int i = 1; i <= numberOfLines; i++){ // running 5 lines
            for(int j = 0; j < i; j++){ 
            // for each line: print number of digits which is also equal order number of this line
            // e.g. for 1st line: print only 1 digit, for 2nd line: print 2 digits, etc.
            // For 1st line: 3 + 0 = 3 so first value of j is 0
            // For 5th (last) line: 3+4 = 7 so last value of j in 2nd for loop is 4 (or less than 5).
                System.out.print(startingDigit+j);
            }
            System.out.println(); // move to next line. 
        }
        System.out.println();
        System.out.println();
    }
}


