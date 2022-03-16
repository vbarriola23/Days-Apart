/*
  Takes two dates in through the client and tells you have many days are between
  them. Leap years are taken into consideration.

  This is some code that I wrote a little less than a year ago. I am really just
  testing out github and how uploading code works.
*/
public class DaysApart{
  private Date day1;
  private Date day2;
  private int daysApart = 0;
  private int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31}
  
  public DaysApart(){
    day1 = new Date();
    day2 = new Date();
  }
  
  public DaysApart(Date day1, Date day2){
    this.day1 = day1;
    Date temp = new Date();
    if(day1.getYear() > day2.getYear()){
      temp = day1;
      this.day1 = day2;
      this.day2 = temp;
    }
    else if(day1.getMonth() > day2.getMonth() && day1.getYear() == day2.getYear()){
      temp = day1;
      this.day1 = day2;
      this.day2 = temp;
    }
    else if(day1.getDay() > day2.getDay() && day1.getMonth() == day2.getMonth() && day1.getYear() == day2.getYear()){
      temp = day1;
      this.day1 = day2;
      this.day2 = temp;
    }
    daysApart();
  }
  
  public void daysApart(){
    int days = 0;
    if(day1.equals(day2))
      daysApart = 0;
    else{
      if(day1.getYear() == day2.getYear())
        days = daysBetweenTwoDatesInSameYear(day1, day2);
      else{
        days += daysBetweenTwoDatesInSameYear(day1, newDate(12,31,day1.getYear()));
        for(int i = day1.getYear() + 1; i < day2.getYear(); i++){
          days += daysBetweenTwoDatesInSameYear(new Date(1, 0, i), new Date(12, 31, i));
        }
        days += daysBetweenTwoDatesInSameYear(new Date(1, 0, day2.getYear(), day2);
      }
    }
  }
                                              
  private int daysBetweenTwoDatesInSameYear(Date day1, Date day2){
    int days = 0;
    if(day1.getMonth() == day2.getMonth())
      days = day2.getDay() - day1.getDay();
    else{
      days += daysOfMonth[day1.getMonth()-1] - day1.getDay();
      for(int i = day1.getMonth() + 1; i < day2.getMonth(); i++){
        days += daysOfMonth[i-1];
      }
      days += day2.getDay();
      if(day1.getYear() % 4 == 0 && day1.getMonth() <= 2 && day2.getMonth() > 2)
        days++;
    }
    return days;
  }
  
  public String toString(){
    return day1.toString() + " and " + day2.toString() + " are " + daysApart + " days apart.";
  }
}
