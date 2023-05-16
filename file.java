import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
    // Initialize smallest and largest substrings to the first substring of length k
    smallest = s.substring(0, k);
    largest = s.substring(0, k);

    // Iterate over all possible substrings of length k in s
    for (int i = 1; i <= s.length() - k; i++) {
        String substring = s.substring(i, i + k);
        
        // Update smallest and largest substrings if necessary
        if (substring.compareTo(smallest) < 0) {
            smallest = substring;
        }
        if (substring.compareTo(largest) > 0) {
            largest = substring;
        }
    }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// // To solve this problem, you need to find the lexicographically smallest and largest substrings 
// of length k in the given string s. One way to approach this problem is to iterate over all possible 
// substrings of length k in s and keep track of the lexicographically smallest and largest substrings seen so far.

// In this implementation, we start by initializing the smallest and largest substrings to the first substring of length k in s. Then, we iterate over all possible substrings of length k in s by using a for loop that starts from the second substring of length k (i.e., the substring starting at index 1) and goes up to the last possible substring of length k (i.e., the substring starting at index s.length() - k).

// For each substring, we compare it to the current smallest and largest substrings using the compareTo method, which returns a negative integer if the substring is lexicographically smaller than the current smallest substring, a positive integer if it is lexicographically larger than the current largest substring, or zero if they are equal. If the substring is smaller than the current smallest substring, we update the smallest substring to be the new substring. Similarly, if the substring is larger than the current largest substring, we update the largest substring to be the new substring.

// Finally, we return the smallest and largest substrings separated by a newline character.
