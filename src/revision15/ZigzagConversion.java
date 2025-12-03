package revision15;

/*
1. Zigzag Conversion (LeetCode 6)
Problem

Convert a string into a zigzag pattern and read it row by row.

Example:
Input: "PAYPALISHIRING", numRows = 3
Zigzag looks like:

P   A   H   N
A P L S I I G
Y   I   R

Output: "PAHNAPLSIIGYIR"

Logic Explanation (Very Simple)

Imagine writing characters in a zigzag (down → up → down → up).

We maintain one StringBuilder for each row.

We move through rows like:

0 → 1 → 2 → 1 → 0 → 1 → 2 → ...

Append each character to the current row.

When we reach top/bottom row, reverse direction.
 */


public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            // Change direction at top or bottom
            if (row == 0) goingDown = true;
            else if (row == numRows - 1) goingDown = false;

            row += goingDown ? 1 : -1;
        }

        // Join all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb.toString());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows)); // Output: PAHNAPLSIIGYIR
    }
}

/*
Time & Space Complexity

Time: O(n), we visit each character once.

Space: O(n), result + row builders.
 */