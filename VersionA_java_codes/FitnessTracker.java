import java.util.ArrayList;


public class FitnessTracker {
    // Store workouts
    private ArrayList<Workout> workoutList;

    // tracker list initialize
    public FitnessTracker() {
        this.workoutList = new ArrayList<>();
    }

    // (Create/Add)
    public void addWorkout(Workout workout) {
        workoutList.add(workout);
        System.out.println(" Workout added successfully!");
    }

    //  (Read/Display)
    public void displayWorkouts() {
        if (workoutList.isEmpty()) {
            System.out.println(" No workouts logged yet for today.");
            return;
        }
        System.out.println("\n--- --- YOUR WORKOUT LOG --- ---");
        for (Workout w : workoutList) {
            System.out.println(w); // workout print string
        }
    }

    // burned calories calculation
    public double calculateTotalCalories() {
        double total = 0;
        for (Workout w : workoutList) {
            total += w.getCaloriesBurned();
        }
        return total;
    }
}

