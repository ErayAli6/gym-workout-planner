package singleton;

import strategy.WorkoutProgramManager;

public class Gym {

    private static Gym instance;
    private final WorkoutProgramManager workoutProgramManager;

    private Gym() {
        workoutProgramManager = new WorkoutProgramManager();
        System.out.println("Gym instance created.");
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        System.out.println("Gym instance obtained.");
        return instance;
    }

    public WorkoutProgramManager getWorkoutProgramManager() {
        System.out.println("WorkoutProgramManager accessed.");
        return workoutProgramManager;
    }
}
