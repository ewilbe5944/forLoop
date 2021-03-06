/**
 * Complete each loop problem and test in main.
 * 
 * @author Emily Wilber
 * @version Oct 2, 2018
 */

public class ForLoopPractice 
{
        // Return the sum of all ints in the range a to b inclusive.
    public static int sum(int a, int b) {
        int sum = 0;
        
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    
    // Return the sum of all even ints in the range a to b inclusive.
    public static int sumRange(int a, int b) {
        int sum = 0;
        if (a % 2 != 0) {
            a +=1;
        }
        if (b % 2 != 0) {
            b -=1;
        }
        
        for (int i = a; i <= b; i += 2) {
            sum += i;
        }
        
        return sum;
    }
    

    // Return the sum of all ints in the range 1 to n that are evenly divisible by both a and b.
    public static int sumAndDiv(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    
    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b.
    public static int sumOrDiv(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 || b % i == 0) {
                sum += i;
            }
        }
        return sum;
    }


    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b but not both.
    public static int sumXOrDiv(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 ^ b % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Return the sum of the first n perfect squares.
    public static int sumSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i))) {
                sum += i;
            }
        }
        return sum;
    }

    // Return true if an int n contains the digit d, and false otherwise.
    public static boolean hasDigit(int n, int d) {
        for (int i = 0; i < (n + "").length(); i++) {
            if (((n + "").substring(i,i+1)).equals(d+"")) {
                return true;
            }
           
        }
        return false;
    }


    // Return the sum of digits in an int.
    public static int sumDigits(int n) {
        int sum = 0;
        for (int i = 0; i < (n + "").length(); i++) {
            sum += Integer.parseInt((n + "").substring(i,i+1));
           
        }
        return sum;
    }


    // Return the sum of all odd digits in an int.
    public static int sumOddDigits(int n) {
        int sum = 0;
        int digit;
        for (int i = 0; i < (n + "").length(); i++) {
            digit = Integer.parseInt((n + "").substring(i,i+1));
            if (digit % 2 == 1) {
                sum += digit;
            }
        }
        return sum;
    }


    // Return true if the number of even digits in an int is greater than the number of odd digits
    public static boolean moreEvens(int n) {
        int evens = 0;
        int odds = 0;
        int digit;
        for (int i = 0; i < (n + "").length(); i++) {
            digit = Integer.parseInt((n + "").substring(i,i+1));
            if (digit % 2 == 1) {
                odds++;
            }
            else  {
                evens++;
            }
        }
        return (evens > odds);
    }
    

    // Return String str with the characters in reverse order. 
    public static String reverse(String str) {
        String rev = "";
        
        for (int i=0; i<str.length(); i++)
            rev = str.charAt(i) + rev;
        
        return rev;
    }
    
    
    // Return the sum of the unicode values of the characters in str.
    public static int unicodeSum(String str) {
        int sum = 0;
        for (int i = 0; i < (str + "").length(); i++) {
            sum += (int)str.charAt(i);
           
        }
        return sum;

    }
    
    // Return true if str is a palindrome. All input will contain only lowercase letters.
    public static boolean easyPalindrome(String str) {
        int mid = str.length()/2;
        for (int i=0; i<mid; i++)
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        
        return true;    
    }

    
    // Return String str with all non-capital letters removed.
    //  NOTE: "noCaps" does not mean what the line above says
    public static String noCaps(String str) {
        String noCapStr = "";
        
        for (int i=0; i<str.length(); i++)  {
            //  to make this remove caps as in "noCaps" remove the ! below
            if (!Character.isUpperCase(str.charAt(i))) { 
                noCapStr = noCapStr + str.charAt(i);
            }
        }

        return noCapStr;
    }
    // Return String str with all capital letters turned to lowercase and lowercase to capital. Any other characters should remain unchanged.
    public static String capSwap(String str)
    {
        String newStr = "";
        
        for (int i=0; i<str.length(); i++)  {
            if (Character.isUpperCase(str.charAt(i))) { 
                newStr = newStr + Character.toLowerCase(str.charAt(i));
            }
            else if (Character.isLowerCase(str.charAt(i))) {
                newStr = newStr + Character.toUpperCase(str.charAt(i));
            }
            else {
                newStr += str.charAt(i);
            }
        }

        return newStr;
 
    }
    
    // Return true if str is a palindrome with respect to letters only. 
    public static boolean hardPalindrome(String str) {
        String stripped = "";
        str = str.toLowerCase();
        
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            
            if (c>=97 && c<=122)
                stripped += c;
        }
        
        return easyPalindrome(stripped);
    }

    
    // Return the factorial of n.
    public static int factorial(int n) {
        int product=1;
        
        for (int i=1; i<=n; i++)  {
            product = product * i;
        }
        return product;
    }
    
    
    // Return the nth term in the Fibonacci sequence beginning with {0, 1, 1, 2, ...}
    public static int nthFib(int n) {
        int a = 0;
        int b = 1;
        int fib = 0;
        if (n == 0)  {
            return 0;
        }
        if (n == 1)  {
            return 1;
        }
        for (int i=1; i<n; i++) {
            fib = a + b;
            a = b;
            b= fib;
        }
        return fib;
    }
    
    public static void main(String[] args)
    {
        //System.out.println( sum(5,10) );
        //System.out.println( sumSquares(10) );
        //System.out.println( sumOddDigits(1074) );
        System.out.println( "yo");
           
        /** 
        if (moreEvens(81643))  {
            System.out.println( "moreEvens is true");
        }
        if (hasDigit(105, 1)) {
            System.out.println( "hasDigit(105,1) is true");
        }
        else  {
            System.out.println( "has digit called returned false" );
        }
        **/
        for (int j=0; j<6; j++) {
            System.out.println( "Fibonacci" + j + "is" + nthFib(j) );
        }
        //System.out.println( reverse("hello") );
        //System.out.println( capSwap("I like cats!  Yay!") );
        //System.out.println( easyPalindrome("hello") );
        //System.out.println( easyPalindrome("racecar") );
        //System.out.println( easyPalindrome("Madam, I'm adam.") );
        //System.out.println( hardPalindrome("Madam, I'm adam.") );
    }
}