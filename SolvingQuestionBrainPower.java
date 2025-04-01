public class SolvingQuestionBrainPower{
    public static void main(String args[]){
        int questions[][] = {{3,2},{4,3},{4,4},{2,5}};
        System.out.println(solvingQuestionBrainPower(questions));
    }
    public static long solvingQuestionBrainPower(int questions[][]){
        long dp[] = new long[questions.length+1];
        for(int i = questions.length-1;i>=0;i--){
            int point = questions[i][0];
            int brainpower = questions[i][1];
            long nextQuest = (i+brainpower+1 < questions.length) ? dp[i+brainpower+1]:0;
            dp[i] = Math.max(dp[i+1],point+nextQuest);
        }
        return dp[0];
    }
}