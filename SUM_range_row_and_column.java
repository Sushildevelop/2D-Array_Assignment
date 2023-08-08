package Practice.Array.TwoDArray.Assignment;

import java.util.Scanner;

public class SUM_range_row_and_column {

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
        System.out.println("Enter the range of rows: ");
        int srow=sc.nextInt();
        int erow=sc.nextInt();
        System.out.println("Enter the range of columns: ");
        int scol=sc.nextInt();
        int ecol=sc.nextInt();
        int sum=0;
        while(srow <= erow){
            int j=scol;
            while(j<=ecol){
                sum+=arr[srow][j];
                j++;
            }
            srow++;
        }
        System.out.println(sum);
    }
}
