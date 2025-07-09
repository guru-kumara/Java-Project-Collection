import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snake {
    private char[][] board;
    Queue<Node> queue=new LinkedList<Node>();
    Scanner sc=new Scanner(System.in);
    public Snake(int row,int col)
    {
        this.board=new char[row][col];
        this.queue.add(new Node(0,0));
        this.board[0][0]='.';
        this.board[1][0]='X';
        this.board[2][2]='X';
        this.board[3][4]='X';
        this.board[5][2]='X';
    }
    public void startgame(int row,int col)
    {
        if(row<0 || row>=board.length || col<0 || col>=board[0].length)
        {
            System.out.println("Game over");
            return;
        }
        if(row>=0 && row<board.length && col>=0 && col<board[0].length)
        {
            if(board[row][col]=='.' && row!=0 && col!=0)
            {
                System.out.println("Game over");
                return;
            }
        queue.add(new Node(row,col));
        if(board[row][col]!='X')
        {
            Node node=queue.poll();
            int r=node.getrow();
            int c=node.getcol();
            board[r][c]='-';
        }
        board[row][col]='.';
        printsnake();
        System.out.println("Enter direction");
        char dir=sc.next().toUpperCase().charAt(0);
        switch(dir)
        {
            case 'U':
                startgame(row-1,col);
                break;
            case 'D':
                startgame(row+1,col);
                break;
            case 'L':
                startgame(row,col-1);
                break;
            case 'R':
                startgame(row,col+1);
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }
        }
    }
    public void printsnake()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='\0')
                {
                    System.out.print("-");
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
}
