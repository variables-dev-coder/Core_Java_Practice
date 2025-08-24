package revision_5;

public class Notes {
    public static void main(String[] args) {

        /*

1. Definition & Memory Storage of Arrays in Java
Definition:

    An array is a collection of elements of the same data type, stored in contiguous memory locations.
    It is fixed in size (cannot grow/shrink after creation).

In Java, arrays are objects, not primitive data structures.
    int[] arr = new int[5];  // creates an array of size 5

Memory Storage:
    Arrays are stored in heap memory because they are objects.
    The reference variable (like arr) is stored in the stack, which points to the heap memory.

Example: int[] arr = new int[5];
    Stack → reference arr
    Heap → actual array [0,0,0,0,0]



2. Advantages & Limitations of Arrays

Advantages:
1.Fast Access – Direct access to elements using index (O(1)).
2.Memory Efficiency – Contiguous memory makes cache-friendly.
3.Easy to Use – Simple syntax for traversal and access.

Limitations:
1.Fixed Size – Cannot change once created.
2.Insertion/Deletion is Costly – Requires shifting elements (O(n)).
3.Wastage of Memory – If array is underutilized, memory is wasted.
4.Only Homogeneous Data – Can store only one type (e.g., all int).


3. 1D vs 2D Arrays
1D Array
    Linear structure → elements stored in a single row.
    int[] arr = {10, 20, 30, 40};


2D Array
    Matrix-like structure → rows & columns.

    int[][] matrix = {
   {1, 2, 3},
   {4, 5, 6},
   {7, 8, 9}
    };

Stored in row-major order in memory (row by row).



4. Common Operations
    Traversal (O(n))

    for(int i=0; i<arr.length; i++) {
    System.out.print(arr[i] + " ");
    }


Insertion (O(n))
    Insert at index → shift right.

    int[] arr = {1, 2, 4, 5};
    int pos = 2, value = 3;
    for(int i=arr.length-1; i>pos; i--) {
    arr[i] = arr[i-1];
    }
    arr[pos] = value;


Deletion (O(n))
    Delete at index → shift left.

    int[] arr = {1, 2, 3, 4, 5};
    int pos = 2;
    for(int i=pos; i<arr.length-1; i++) {
    arr[i] = arr[i+1];
    }

   Update (O(1))

    arr[2] = 50;  // update element at index 2


    Search
        Linear Search: O(n)
        Binary Search (only sorted arrays): O(log n)


5. Time Complexity

| Operation       | Complexity |
| --------------- | ---------- |
| Access by index | O(1)       |
| Traversal       | O(n)       |
| Search (Linear) | O(n)       |
| Search (Binary) | O(log n)   |
| Insertion       | O(n)       |
| Deletion        | O(n)       |




         */
    }
}
