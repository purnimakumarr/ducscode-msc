/*
 * WAP to implement/using array- One-Dimensional, Two-Dimensional and print/show the results. All inputs are available in programs/ runtime.
 */

 class ArraysDemo {
  public static void main(String[] args) {
    int nums[], nums1[][];
    nums = new int[10];
    nums1 = new int[5][5];
    for(int i  = 0;  i < 10; i++) {
      nums[i] = i;
    }
    System.out.print("One-dimensional array: [ ");
    for(int j = 0; j < 10; j++) {
      System.out.print(nums[j] + " ");
    }
    System.out.println("]");
    System.out.println("Length of array is " + nums.length);

    for(int k  = 0;  k < 5; k++) {
      for(int l = 0; l < 5; l++) {
        nums1[k][l] = l;
      }
    }
    System.out.print("Two-dimensional array: [");
    for(int x = 0; x < 5; x++) {
      System.out.print("[ "); 
      for(int y = 0; y < 5; y++) {
        System.out.print(nums1[x][y] + " ");
      }
      System.out.print("]");
    }
    System.out.println("]");
    System.out.print("Length of array is " + nums1.length + ", " + nums1[0].length);
  }
 }