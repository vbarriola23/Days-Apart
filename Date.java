public class Date{
    private int month;
    private int day;
    private int year;
    
    public Date(){
        month = 0;
        day = 0;
        year = 0 ;
    }
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public boolean equals(Object other){
        if (other instanceof Date){
            if (this.year == ((Date)other).year && this.month == ((Date)other).month && this.day == ((Date)other).day){
                return true;
            } 
            else 
                return false;
        }
        else 
            return false;
    }
                
    public String toString(){
        return month + "/" + day + "/" + year;    
    }
}
