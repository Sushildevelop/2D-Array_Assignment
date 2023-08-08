package Practice.Array.TwoDArray.Assignment;

import java.util.Scanner;

public class Find_element_X {
    static void FindElement2_Darray(int [][]arr,int n,int m,int x){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i][j]==x){
                    System.out.println("Row = "+i);
                    System.out.println("Column= "+j);
                    return;
                }
            }
        }
        System.out.print(-1);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row");
        int n=sc.nextInt();
        System.out.println("Enter the column");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the element of 2-D array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Element: X");
        int x=sc.nextInt();
        System.out.println("Print 2-D array index of row and column : ");
        FindElement2_Darray(arr,n,m,x);
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }

    }
}
