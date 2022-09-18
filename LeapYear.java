public class LeapYear {
    int year;
    boolean leap = false;
    public LeapYear(int year) {
        this.year = year;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true;
                }else leap = false;
            } else leap = true;
        }else leap = false;
    }

    public boolean getbool() {
        return leap;
    }
    public int getYear(){
        return year;
    }
}
