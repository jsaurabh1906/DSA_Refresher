# Arrays in Java

An array is one of the most fundamental and important data structures in Java.

It stores **multiple values of the same data type** in a **single variable** using **continuous memory locations**.

---

# 1. What is an Array?

Imagine you want to store marks of 5 students.

Without arrays:

```java
int mark1 = 90;
int mark2 = 85;
int mark3 = 76;
int mark4 = 88;
int mark5 = 95;
```

This becomes difficult to manage.

Using arrays:

```java
int[] marks = {90, 85, 76, 88, 95};
```

Now all values are stored together.

---

# 2. Features of Arrays

## Fixed Size

Once created, array size cannot change.

```java
int[] arr = new int[5];
```

Size is permanently 5.

---

## Same Data Type

All elements must be of the same type.

```java
int[] numbers = {1, 2, 3}; // valid
```

```java
int[] numbers = {1, "hello"}; // invalid
```

---

## Indexed Structure

Arrays use indexing starting from `0`.

| Index | Value |
| ----- | ----- |
| 0     | 10    |
| 1     | 20    |
| 2     | 30    |

---

## Fast Access

Accessing elements is extremely fast: `O(1)`

```java
arr[2]
```

Directly jumps to the memory location.

---

# 3. How Arrays Work Internally

Arrays store data in **contiguous memory locations**.

Example:

```java
int[] arr = {10, 20, 30, 40};
```

Memory representation:

```text
Index:   0    1    2    3
Value:  10   20   30   40
```

Address calculation:

```text
address = base + (index × size_of_datatype)
```

This is why array access is very fast.

---

# 4. Declaring Arrays

## Syntax

```java
datatype[] arrayName;
```

Example:

```java
int[] numbers;
```

---

# 5. Creating Arrays

## Using `new`

```java
int[] numbers = new int[5];
```

Creates array of size 5.

Default values:

| Type    | Default Value |
| ------- | ------------- |
| int     | 0             |
| double  | 0.0           |
| boolean | false         |
| String  | null          |

---

# 6. Initializing Arrays

## Method 1

```java
int[] arr = new int[3];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
```

---

## Method 2

```java
int[] arr = {10, 20, 30};
```

---

# 7. Accessing Elements

```java
int[] arr = {10, 20, 30};

System.out.println(arr[0]);
System.out.println(arr[2]);
```

Output:

```text
10
30
```

---

# 8. Updating Elements

```java
int[] arr = {10, 20, 30};

arr[1] = 99;

System.out.println(arr[1]);
```

Output:

```text
99
```

---

# 9. Traversing Arrays

Traversal means visiting every element.

---

## Using For Loop

```java
int[] arr = {10, 20, 30, 40};

for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

## Using Enhanced For Loop

```java
for(int num : arr) {
    System.out.println(num);
}
```

---

# 10. Array Length

```java
arr.length
```

Example:

```java
int[] arr = {1, 2, 3};

System.out.println(arr.length);
```

Output:

```text
3
```

---

# 11. Input Array from User

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

# 12. Common Operations on Arrays

---

## Find Sum

```java
int[] arr = {1, 2, 3, 4};

int sum = 0;

for(int num : arr) {
    sum += num;
}

System.out.println(sum);
```

---

## Find Maximum

```java
int[] arr = {10, 55, 23, 99, 12};

int max = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
```

---

## Find Minimum

```java
int min = arr[0];

for(int num : arr) {
    if(num < min) {
        min = num;
    }
}

System.out.println(min);
```

---

# 13. Time Complexity of Array Operations

| Operation          | Time Complexity |
| ------------------ | --------------- |
| Access             | O(1)            |
| Update             | O(1)            |
| Search             | O(n)            |
| Insertion (middle) | O(n)            |
| Deletion           | O(n)            |

---

# 14. Types of Arrays in Java

---

# A. One-Dimensional Array

```java
int[] arr = {1, 2, 3};
```

---

# B. Two-Dimensional Array

Matrix-like structure.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Visualization:

```text
1 2 3
4 5 6
```

Access:

```java
matrix[1][2]
```

Output:

```text
6
```

---

# 15. Traversing 2D Arrays

```java
for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }

    System.out.println();
}
```

---

# 16. Jagged Arrays

Rows can have different sizes.

```java
int[][] arr = new int[3][];

arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[1];
```

Visualization:

```text
Row 0 → 2 elements
Row 1 → 4 elements
Row 2 → 1 element
```

---

# 17. Arrays Class in Java

Java provides utility methods using `Arrays` class.

Import:

```java
import java.util.Arrays;
```

---

## Sort Array

```java
int[] arr = {5, 2, 8, 1};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));
```

Output:

```text
[1, 2, 5, 8]
```

---

## Convert Array to String

```java
System.out.println(Arrays.toString(arr));
```

---

## Compare Arrays

```java
Arrays.equals(arr1, arr2)
```

---

## Fill Array

```java
Arrays.fill(arr, 100);
```

---

# 18. Important Array Problems in DSA

These are extremely important for interviews.

---

## Reverse Array

```java
int[] arr = {1, 2, 3, 4, 5};

int start = 0;
int end = arr.length - 1;

while(start < end) {

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    start++;
    end--;
}
```

---

## Linear Search

```java
int target = 30;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        System.out.println("Found");
    }
}
```

---

## Binary Search

Works only on sorted arrays.

```java
int left = 0;
int right = arr.length - 1;

while(left <= right) {

    int mid = left + (right - left) / 2;

    if(arr[mid] == target) {
        System.out.println("Found");
        break;
    }

    else if(arr[mid] < target) {
        left = mid + 1;
    }

    else {
        right = mid - 1;
    }
}
```

---

# 19. Advantages of Arrays

✅ Fast access using index  
✅ Easy to traverse  
✅ Memory efficient  
✅ Foundation for many data structures

---

# 20. Disadvantages of Arrays

❌ Fixed size  
❌ Insertion/deletion costly  
❌ Same datatype only  
❌ Memory wastage possible

---

# 21. Arrays vs ArrayList

| Feature           | Array  | ArrayList       |
| ----------------- | ------ | --------------- |
| Size              | Fixed  | Dynamic         |
| Speed             | Faster | Slightly slower |
| Primitive Support | Yes    | Wrapper classes |
| Built-in Methods  | Few    | Many            |

---

# 22. Real World Uses of Arrays

Arrays are used in:

- Image processing
- Matrices
- Game boards
- Storing sensor data
- Database records
- Sorting algorithms
- Searching algorithms

---

# 23. Important Interview Concepts

You must master:

- Traversal
- Prefix Sum
- Sliding Window
- Two Pointer
- Binary Search
- Kadane’s Algorithm
- Rotation Problems
- Sorting
- Matrix Problems

These patterns are heavily based on arrays.

---

# 24. Most Important DSA Array Patterns

---

## Prefix Sum

Used for range sum problems.

```java
prefix[i] = prefix[i - 1] + arr[i];
```

---

## Sliding Window

Used for subarray problems.

```java
windowSum += arr[right];
windowSum -= arr[left];
```

---

## Two Pointer

Used in sorted arrays.

```java
left++;
right--;
```

---

# 25. Best Practice Tips

✅ Use meaningful variable names  
✅ Avoid hardcoding sizes  
✅ Always check bounds  
✅ Use enhanced for-loop when modification isn't needed  
✅ Prefer `ArrayList` if dynamic size needed

---

# 26. Common Mistakes

---

## Array Index Out of Bounds

```java
arr[arr.length]
```

Invalid because last index is:

```java
arr.length - 1
```

---

## Uninitialized Array

```java
int[] arr;
System.out.println(arr[0]);
```

Causes error.

---

# 27. Memory Representation of 2D Array

```java
int[][] arr = {
    {1,2},
    {3,4}
};
```

Actually stores references to row arrays.

```text
arr
 ↓
[ ref ] → [1,2]
[ ref ] → [3,4]
```

---

# 28. Practice Problems

## Easy

- Find max/min
- Reverse array
- Sum of array
- Second largest

## Medium

- Move zeroes
- Rotate array
- Merge sorted arrays
- Kadane’s Algorithm

## Hard

- Trapping rain water
- Median of two sorted arrays
- Maximum product subarray

---

# 29. Conclusion

Arrays are the foundation of DSA.

Almost every advanced topic begins with arrays:

- Strings
- Matrices
- Hashing
- Heap
- Dynamic Programming
- Graphs

If your array fundamentals are strong, learning DSA becomes much easier.
