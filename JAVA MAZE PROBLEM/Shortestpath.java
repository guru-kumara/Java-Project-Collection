import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Shortestpath{
    public static int shortestpath(int n,int[][] mat,int srcrow,int srccol,int destrow,int destcol)
    {
        int[][] dist =new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[srcrow][srccol]=0;
        int[][] dirs = {
    {0, 1}, {1, 0}, {0, -1}, {-1, 0},    
    {1, 1}, {-1, -1}, {-1, 1}, {1, -1}   
};
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,srcrow,srccol});
        while(!pq.isEmpty())
        {
            int[] cur=pq.poll();
            int d=cur[0];
            int r=cur[1];
            int c=cur[2];
            if(r==destrow && c==destcol)
            {
                return d;
            }
            for(int[] dir:dirs)
            {
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nr<n && nc>=0 && nc<n)
                {
                    int newd=d+1;
                    if(newd<dist[nr][nc])
                    {
                        dist[nr][nc]=newd;
                        pq.offer(new int[]{newd,nr,nc});
                    }
                }
            }
        }
        return -1;
    }
    public static void printmatrix(int n,int[][] mat)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            System.out.println("0:Shortest Path");
            System.out.println("1:Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Enter Matrix Dimensions(n*n)");
                    int n=sc.nextInt();
                    System.out.println("Enter Adventure Position(row,col)");
                    int srcrow=sc.nextInt();
                    int srccol=sc.nextInt();
                    System.out.println("Enter Destination Position(row,col)");
                    int destrow=sc.nextInt();
                    int destcol=sc.nextInt();
                    System.out.println("Matrix");
                    int[][] mat=new int[n][n];
                    mat[srcrow][srccol]=1;
                    mat[destrow][destcol]=2;
                    printmatrix(n,mat);
                    System.out.println("Shortest Path is"+" "+shortestpath(n,mat,srcrow,srccol,destrow,destcol));
                    break;

                case 1:
                    flag=false;
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}