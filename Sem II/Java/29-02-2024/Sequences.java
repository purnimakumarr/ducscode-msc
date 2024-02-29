/*
 * WAP to print below sequences: using two-dimensional array and print/show the results. All inputs are available in programs/ runtime.
i. 
    0 1 2 3 4
   5 6 7 8 9
   10 11 12 13 14
   15 16 17 18 19

 ii. 
      0
     1 2
    3 4 5
  6 7 8 9
 10 11 12 13 14

iii. 
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

0 0 0 0 0
0 1 2 3 4
0 2 4 6 8
0 3 6 9 12

0 0 0 0 0
0 2 4 6 8
0 4 8 12 16
0 6 12 18 24
 */

public class Sequences {
  public static void main(String[] args) {
    int sequence[][] = new int [4][5];

    for(int i = 0, n = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++, n++) {
        sequence[i][j] = n;
      }
    }

    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(sequence[i][j] + " ");
      }
      System.out.println();
    }

    int sequence1[][] = new int [5][];

    for(int i = 0, m = 1, num = 0; i < 5; i++) {
      sequence1[i] = new int [m];
      for(int j = 0; j < m; j++, num++) {
        sequence1[i][j] = num;
      }
      m++;
    }

    System.out.println();
    for(int i = 0, m = 1; i < 5; i++) {
      for(int j = 0; j < m; j++) {
        System.out.print(sequence1[i][j] + " ");
      }
      System.out.println();
      m++;
    }

    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        sequence[i][j] = 0;
      }
    }

    System.out.println();
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(sequence[i][j] + " ");
      }
      System.out.println();
    }

    int n = 1, m = 2, r = 3;
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        if(i == 0 || j == 0) {
          sequence[i][j] = 0;
        } else if(i == 1) {
          sequence[i][j] = n;
            n++;
        } else if (i == 2) {
          sequence[i][j] = m;
          m+=2;
        } else if(i == 3) {
          sequence[i][j] = r;
          r+=3;
        }
      }
    }

    System.out.println();
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(sequence[i][j] + " ");
      }
      System.out.println();
    }

    n = 2; m = 4; r = 6;
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        if(i == 0 || j == 0) {
          sequence[i][j] = 0;
        } else if(i == 1) {
          sequence[i][j] = n;
          n+=2;
        } else if (i == 2) {
          sequence[i][j] = m;
          m+=4;
        } else if(i == 3) {
          sequence[i][j] = r;
          r+=6;
        }
      }
    }

    System.out.println();
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(sequence[i][j] + " ");
      }
      System.out.println();
    }
  }
}
