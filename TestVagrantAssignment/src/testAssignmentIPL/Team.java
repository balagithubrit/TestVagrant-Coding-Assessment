package testAssignmentIPL;

class Team{
    private static final int noOfMatches=5;
   private String teamName;
   private int points;
   private char[] stats;
   public Team(String teamName,int points){
       this.teamName=teamName;
       this.points=points;
       this.stats=new char[noOfMatches];
   }
    public int getPoints() {
       return points;
   }
    public void addStats(char[] results) {
        for (int i = 0; i < noOfMatches; i++)
            this.stats[i] = results[i];
    }
    public boolean checkConsecutiveLossOrWin(int n){
       int count=1;
       for(int i=0;i<stats.length-1;i++){
           if(stats[i]=='L' && stats[i+1]=='L' || stats[i]=='W' && stats[i+1]=='W')
               count++;
           else
               count=1;
           if(count==n)
               return true;
       }
       return false;
    }
}
