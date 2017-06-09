public class Main {

    public static void main(String[] args) {
        final int N = 13;            //总人数
        final int S = 3;             //从第S人开始报数
        final int M = 5;             //报数为M的人出圈
        boolean[] out = new boolean[N + 1];     //统一下标
        for (int i =1; i <= N; i++){
            out[i] = false;              //所有人未出圈
        }

        int i = S;                 //下次开始报数的人的编号
        int n = 0;                 //已出圈的人数
        int count;
        System.out.print("出圈顺序：");
        while(n < N){                  //仍有人在圈外
            count = 0;                //出圈后重新计数
            while (count < M){           //未报数至M
                if (out[i] == false){        //报数的人未出圈
                    count ++;           //报数
                }
                if (count < M){
                    i = (i + 1 > N ? 1:i+1);            //求下一个人的编号
                }
            }//内层while结束
            System.out.print(i + " ");
            out[i] = true;
            n ++;
        }//外层while结束
    }
}
