import java.util.Scanner;

//多线程
public class MathThread extends Thread{
    private long endNum;
    private long stareNum;
    private int x;
    public static long ans;
    static {
        ans = 0;
    }

    public MathThread(long stareNum,int x,long endNum) {
        this.stareNum = stareNum;
        this.endNum = endNum;
        this.x = x;
    }
    //将循环分为n/10000块
    @Override
    public void run() {
        for(long i = stareNum;i<endNum;i++){
            if(contain(i,x)) ans+=i;
        }
    }

    private static boolean contain(long num, int x) {
        return String.valueOf(num).contains(String.valueOf(x));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (long i = 0; i <= 1000000000; i+=10000) {
            new MathThread(i+1,x,i+10000).start();
        }
        System.out.println(MathThread.ans);
    }
}
