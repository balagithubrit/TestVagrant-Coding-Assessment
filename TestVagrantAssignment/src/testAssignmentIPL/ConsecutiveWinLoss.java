package testAssignmentIPL;

public class ConsecutiveWinLoss {
	  public static void main (String[] args) {
	        Team teams[]=new Team[5];
	       teams[0]=new Team("MI",8);
	        teams[0].addStats(new char[]{'L', 'L', 'L', 'W', 'W'});
	        teams[1]=new Team("CSK",16);
	        teams[1].addStats(new char[]{'W', 'L', 'W', 'W', 'W'});
	        teams[2]=new Team("RCB",14);
	        teams[2].addStats(new char[]{'L', 'W', 'L', 'L', 'W'});
	        teams[3]=new Team("RR",12);
	        teams[3].addStats(new char[]{'L', 'L', 'L', 'W', 'W'});
	        teams[4]=new Team("SRH",10);
	        teams[4].addStats(new char[]{'L', 'W', 'L', 'W', 'L'});
	        int n=2;
	        int totalTeams=0,sumOfPoints=0;
	        for(int i=0;i<5;i++){
	            if(teams[i].checkConsecutiveLossOrWin(n)) {
	                sumOfPoints=sumOfPoints+teams[i].getPoints();
	                totalTeams++;
	            }
	        }
	        System.out.println("Total Teams:"+totalTeams+"  "+"AVG:"+sumOfPoints/totalTeams);
	    }

}
