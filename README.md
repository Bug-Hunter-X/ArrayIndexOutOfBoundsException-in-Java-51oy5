# ArrayIndexOutOfBoundsException Bug in Java

This repository demonstrates a common error in Java: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains code that attempts to access an array element using an index that is out of bounds. The `bugSolution.java` file shows the corrected code.

## Bug Description
The `ArrayIndexOutOfBoundsException` is thrown when an application tries to access an array element using an invalid index.  Valid indices range from 0 to array.length - 1.  Attempting to access an index outside this range causes this exception.

## How to Reproduce
1. Compile the `bug.java` file using a Java compiler (e.g., `javac bug.java`).
2. Run the compiled code (e.g., `java MyClass`).
3. Observe the `ArrayIndexOutOfBoundsException` being thrown.

## Solution
The corrected code in `bugSolution.java` addresses the issue by ensuring the index used to access the array is within the valid bounds.