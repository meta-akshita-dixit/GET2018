
/**
 * This class has a method that calculates the waiting,start and finishing time of a job according to the given arrival time and job size.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */
package assignment4;

public class FirstComeFirstServe {

	public int[][] FCFS(int arrival_time [], int job_size[])
	{
		int length = arrival_time.length;
		int loopCounter;
		int outputArr[][] = new int[length][5];
		for(loopCounter = 0; loopCounter < length; loopCounter++)                                        //initializing first two columns
		{
			outputArr[loopCounter][0] = loopCounter+1;
			outputArr[loopCounter][1] = arrival_time[loopCounter];
		}
		outputArr[0][2] = 0;
		outputArr[0][3] = arrival_time[0];
		outputArr[0][4] = job_size[0] + arrival_time[0] - 1;
		for(loopCounter = 1; loopCounter < length; loopCounter++)
		{
			if(outputArr[loopCounter-1][4] >= outputArr[loopCounter][1])                                 //if arrival time of next job is less than finishing time of previous job.
			{
				outputArr[loopCounter][3] = outputArr[loopCounter - 1][4] + 1;                           //start time=finishing time of previous job+1
				outputArr[loopCounter][2] = outputArr[loopCounter][3] - outputArr[loopCounter][1];       //waiting time=start time-arrival time
				outputArr[loopCounter][4] = outputArr[loopCounter][3] + job_size[loopCounter] - 1;       //finishing time=start time+job size-1
			}
			else
			{
				outputArr[loopCounter][2] = 0;                                                           //waiting time
				outputArr[loopCounter][3] = arrival_time[loopCounter];                                   //start time
				outputArr[loopCounter][4] = outputArr[loopCounter][3] + job_size[loopCounter] - 1;       //finishing time
			}
		}
		return outputArr;
	}
}
