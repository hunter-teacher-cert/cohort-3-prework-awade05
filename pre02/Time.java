public class Time {
public static void main(String[]args){
  int hour = 14;
  int minute = 53;
  int sec = 30;
  int timeOfDayInSeconds = 24 * 60 * 60;
  int timesinceMidnightInSec = hour * 3600 + minute * 60 + sec;
  int hournow = 21;
  int minutenow = 59;
  int secnow = 0;
  int timeNow = hournow * 3600 + minutenow * 60 + secnow;
  int elapsedTime = timeOfDayInSeconds - timeNow;

System.out.print("Number of seconds since midnight: ");
System.out.println(timesinceMidnightInSec);

System.out.print("Number of seconds remaining in the day: ");
System.out.println (timeOfDayInSeconds-timesinceMidnightInSec) ;

System.out.print("Percentage of the day that has passed: ");
System.out.println((double)timesinceMidnightInSec / (double)(24 * 60 *60) +"%");
System.out.print("Elapsed time that has passed: ");
System.out.println(elapsedTime);
}
}