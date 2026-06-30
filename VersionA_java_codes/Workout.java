// to store details on workouts
public class Workout {
    private String workoutName;
    private int durationMinutes;
    private double caloriesBurned;

    // Constructor- for create workout data
    public Workout(String workoutName, int durationMinutes, double caloriesBurned) {
        this.workoutName = workoutName;
        this.durationMinutes = durationMinutes;
        this.caloriesBurned = caloriesBurned;
    }


    public String getWorkoutName() {
        return workoutName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }


    @Override
    public String toString() {
        return "Workout: " + workoutName + "  Duration: " + durationMinutes + " mins  Calories Burned: " + caloriesBurned + " kcal";
    }
}

