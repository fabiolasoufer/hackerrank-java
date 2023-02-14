/*
"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read N lines of input until you reach EOF, then number and print all N lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.

INPUT FORMAT
Read some unknown N lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
OUTPUT FORMAT
For each line, print the line number, followed by a single space, and then the line content received as input.
*/

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; sc.hasNext(); i++){
            System.out.println(i+" "+sc.nextLine());
        }
    }
}


