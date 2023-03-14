public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        if (second > 59){
            this.minute += second % 60;
        }
        if (minute > 59){
            this.hour += minute % 60;
        }
        this.hour = hour % 24;
        this.minute = minute % 60;
        this.second = second % 60;
    }

    int getHour(){
        return hour;
    }
    int getMinute(){
        return minute;
    }
    int getSecond(){
        return second;
    }
    void setHour(int hour){
        this.hour = hour % 24;
    }
    void setMinute(int minute){
        if (minute > 59){
            this.hour += minute % 60;
        }
        this.minute = minute % 60;
    }
    void setSecond(int second){
        if (second > 59){
            this.minute += second % 60;
        }
        this.second = second % 60;
    }

    void setTime(int hour, int minute, int second){
        if (second > 59){
            this.minute += second % 60;
        }
        if (minute > 59){
            this.hour += minute % 60;
        }
        this.hour = hour % 24;
        this.minute = minute % 60;
        this.second = second % 60;
    }

    @Override
    public String toString(){
        String minuteS = Integer.toString(minute);
        String secondS = Integer.toString(second);
        String hourS = Integer.toString(hour);
        if (minute < 10 && minute >= 0){
            minuteS = "0" + minuteS;
        }
        if (second < 10 && second >= 0){
            secondS = "0" + secondS;
        }
        if (hour < 10 && hour >= 0){
            hourS = "0" + hourS;
        }
        return hourS + ":" + minuteS + ":" + secondS;
    }

    Time nextSecond(){
        this.second += 1;
        if (second > 59){
            this.minute += 1;
            this.second = second % 60;
        }
        if (minute > 59){
            this.hour += 1;
            this.minute = minute % 60;
        }
        if (hour > 23){
            this.hour = 0;
        }
        return this;
    }

    Time previousSecond(){
        if (second == 0){
            if (minute == 0){
                this.minute = 60;
            }
            this.minute -= 1;
            this.second = 59;
        }
        if (minute == 0){
            if (hour == 0){
                this.hour = 24;
            }
            this.hour -= 1;
        }
        if (hour == 0){
            this.hour = 23;
        }
        return this;
    }
}
