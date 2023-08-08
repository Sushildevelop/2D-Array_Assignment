package Practice.Array.TwoDArray.Assignment;

import java.util.Scanner;

public class rerverse_two_D_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Colum: ");
        int m=sc.nextInt();
        int [][] mat=new int[n][m];
        System.out.println("Enter the element of the array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            int a=0;
            int b=m-1;
            while (a < b){
                int temp=mat[i][a];
                mat[i][a]=mat[i][b];
                mat[i][b]=temp;
                a++;
                b--;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
