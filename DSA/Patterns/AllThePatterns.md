# Pattern Programs in Java

This file contains different pattern programs implemented in Java.
Each section includes a short description, pattern type, output example, and the corresponding code.

---

## Pattern 1

**Description:** Prints a square of stars with `n` rows and `n` columns.
**Pattern Type:** Square Pattern

**Output (n=5):**

```
 *  *  *  *  *  
 *  *  *  *  *  
 *  *  *  *  *  
 *  *  *  *  *  
 *  *  *  *  *  
```

**Code:**

```java
public static void pattern1(int n) {
    System.out.println("----Pattern 1 ----");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(" * ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 2

**Description:** Prints a left-aligned right-angled triangle of stars.
**Pattern Type:** Right Triangle Pattern

**Output (n=5):**

```
*  
* *  
* * *  
* * * *  
* * * * *  
```

**Code:**

```java
public static void pattern2(int n) {
    System.out.println("----Pattern 2 :");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 3

**Description:** Prints increasing numbers in a right triangle shape.
**Pattern Type:** Number Triangle

**Output (n=5):**

```
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  
```

**Code:**

```java
public static void pattern3(int n) {
    System.out.println("----Pattern 3 ----");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 4

**Description:** Prints repeated row numbers in a right triangle.
**Pattern Type:** Number Triangle

**Output (n=5):**

```
1  
2 2  
3 3 3  
4 4 4 4  
5 5 5 5 5  
```

**Code:**

```java
public static void pattern4(int n) {
    System.out.println("----Pattern 4 ----");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 5

**Description:** Prints an inverted right triangle of stars.
**Pattern Type:** Inverted Triangle

**Output (n=5):**

```
* * * * *  
* * * *  
* * *  
* *  
*  
```

**Code:**

```java
public static void pattern5(int n) {
    System.out.println("----Pattern 5 ----");
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < n - i + 1; j++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 6

**Description:** Prints inverted numbers starting from `1` to decreasing `n`.
**Pattern Type:** Inverted Number Triangle

**Output (n=5):**

```
1 2 3 4 5  
1 2 3 4  
1 2 3  
1 2  
1  
```

**Code:**

```java
public static void pattern6(int n) {
    System.out.println("----Pattern 6 ----");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i + 1; j++) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 7

**Description:** Prints a pyramid of stars centered with spaces.
**Pattern Type:** Pyramid Pattern

**Output (n=5):**

```
    *    
   ***   
  *****  
 ******* 
*********
```

**Code:**

```java
public static void pattern7(int n) {
    System.out.println("----Pattern 7 ----");
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        // Spaces (optional)
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
```
---

## Pattern 8

**Description:** Prints an inverted pyramid of stars with spaces at the beginning of each row.
**Pattern Type:** Inverted Pyramid

**Output (n=5):**

```
********* 
 *******  
  *****   
   ***    
    *     
```

**Code:**

```java
public static void pattern8(int n) {
    System.out.println("----Pattern 8 ----");
    for (int i = 0; i < n; i++) {
        // Space
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // Star
        for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
            System.out.print("*");
        }
        // Space
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 9

**Description:** Prints a diamond pattern made up of a pyramid followed by an inverted pyramid.
**Pattern Type:** Diamond Pattern

**Output (n=5):**

```
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
```

**Code:**

```java
public static void pattern9(int n) {
    System.out.println("----Pattern 9 ----");
    // Top pyramid
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
    // Inverted pyramid
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
            System.out.print("*");
        }
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 10

**Description:** Prints a diamond outline with stars forming a growing and shrinking triangle.
**Pattern Type:** Double Triangle / Symmetric Pattern

**Output (n=5):**

```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```

**Code:**

```java
public static void pattern10(int n) {
    System.out.println("----Pattern 10 ----");
    for (int i = 1; i <= 2 * n - 1; i++) {
        int star = i;
        if (i > n) {
            star = 2 * n - i;
        }
        for (int j = 1; j <= star; j++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}
```

---

## Pattern 11

**Description:** Prints a right triangle of `0` and `1` in alternating order.
**Pattern Type:** Binary Number Triangle

**Output (n=5):**

```
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
```

**Code:**

```java
public static void pattern11(int n) {
    System.out.println("----Pattern 11----");
    int start = 1;
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            start = 1;
        } else {
            start = 0;
        }
        for (int j = 0; j <= i; j++) {
            System.out.print(start + " ");
            start = 1 - start;
        }
        System.out.println(" ");
    }
}
```

---

