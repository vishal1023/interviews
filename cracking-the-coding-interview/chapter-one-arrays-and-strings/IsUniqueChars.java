//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

//Here in this solution we set the bit value of the particular char to 1 by doing --  checker |= (1 << val)
//Next time we check if the that particular bit is set if yes this mean that character is already present.

public class IsUniqueChars {
    public boolean isUniqueChars(String str) {
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) { // here we check if the bit was added in previous iteration
                return false;
            }
            checker |= (1 << val); // add the bit for the new char in the checker to be checked in next iteration
        }
        return true;
    }

    public static void main(String[] args) {
        IsUniqueChars isUniqueChars = new IsUniqueChars();
        System.out.println("isUniqueChars = " + isUniqueChars.isUniqueChars("oeabcd"));
        System.out.println("isUniqueChars = " + isUniqueChars.isUniqueChars("tempo"));
    }
}
