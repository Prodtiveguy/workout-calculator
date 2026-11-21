import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class WorkoutSession{
    private String date;
    private double totalSeconds;
    private int distance;

    public WorkoutSession(double totalSeconds,int meters, String date){
    this.date = date;
    distance = meters;
    this.totalSeconds = totalSeconds;
    validator();
    }
    
    public double getPace(){
        double pace = getMinutes() / getMtoKm();
        return pace;
    }

    public double getSeconds(){
        return totalSeconds;
    }

    public int getDistance(){
        return distance;
    }

    public double getMtoKm(){
        double DistanceKm = (getDistance() / 1000.0);
        return DistanceKm;
    }

    public String getDate(){
        return date;
    }

    public int getMinutes(){
        int min = (int) (totalSeconds / 60);
        return min;
    }

    public String getMinSec(){
        int sec = (int) (getSeconds() % 60);
        String minSec = getMinutes() + " min " + sec + " seconds";
        return minSec;
    }

    public void validator(){
        if (totalSeconds < 0 ){
            throw new IllegalArgumentException("Duration cannot be under 0!");
        }
        if (totalSeconds == 0){
            throw new IllegalArgumentException("Please workout longer!");
        }
        if (distance < 0){
            throw new IllegalArgumentException("Distance cannot be negative!");
        }
        if (distance == 0){
            throw new IllegalArgumentException("Please walk/run more distance...");
        }
        try {
            LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date! Use YYYY-MM-DD, e.g. 2026-11-21.");
        }
    }
    
    public String toString(){
        return "Workout Summary:\n" + "Date: " + date + "\n" + "Duration: " + getMinSec() + "\n" + "Distance: " + getMtoKm() + "km" + "\n" + "Pace: " + getPace() + "km / min";
    }

}