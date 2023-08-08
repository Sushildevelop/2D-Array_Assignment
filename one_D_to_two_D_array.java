package Practice.Array.TwoDArray.Assignment;

import java.util.Scanner;

public class one_D_to_two_D_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array you want to convert to: ");
        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        int arr[]=new int[m*n];
        int [][]matrx=new int[n][m];
        System.out.println("Enter the elements  of 1 D array: ");
        for (int i=0;i<m*n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrx[i][j]=arr[index];
                index++;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrx[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
