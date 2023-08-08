package Practice.Array.TwoDArray.Assignment;

import java.util.Scanner;

public class find_element_X_matrix {
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
        System.out.println("Enter the element to be searched: ");
        int x=sc.nextInt();
        int i=0;
        int j=m-1;
        while (i<n && j>=0){
            if (arr[i][j]==x){
                System.out.println("Row = "+i);
                System.out.println("Column = "+j);
                return;
            }
            if (arr[i][j]>x) j--;
            else i++;
        }
        System.out.print(-1);
    }
}
