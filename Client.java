public class Client{
    public static void main(String [] args){
      //test outputs:
      //0 days
      Date day1 = new Date(3,13,97);
      Date day2 = new Date(10,27,21);
      DaysApart compare = new DaysApart(day1,day2);
      System.out.println(compare);
      
      //1 day
      day1 = new Date(6,27,96);
      day2 = new Date(6,28,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
      
      //1 day
      day1 = new Date(6,28,96);
      day2 = new Date(6,27,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
        
      //365 days
      day1 = new Date(1,1,95);
      day2 = new Date(1,1,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
      
      //365 days
      day1 = new Date(1,1,96);
      day2 = new Date(1,1,95);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
        
      //14 days
      day1 = new Date(2,25,96);
      day2 = new Date(3,10,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
        
      //14 days
      day1 = new Date(3,10,96);
      day2 = new Date(2,25,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
        
      //12 days
      day1 = new Date(12,25,96);
      day2 = new Date(1,6,97);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
        
      //12 days
      day1 = new Date(1,6,97);
      day2 = new Date(12,25,96);
      compare = new DaysApart(day1,day2);
      System.out.println(compare);
    }
}
