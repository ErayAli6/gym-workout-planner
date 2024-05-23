package singleton;

import observer.WorkoutProgramManager;

import java.util.ArrayList;
import java.util.List;

public class Gym {

    private static Gym instance;

    private final List<WorkoutProgramManager> workoutProgramManagers;

    private Gym() {
        workoutProgramManagers = new ArrayList<>();
        System.out.println("Gym instance created.");
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        System.out.println("Gym instance obtained.");
        return instance;
    }

    public List<WorkoutProgramManager> getWorkoutProgramManagers() {
        System.out.println("WorkoutProgramManagers accessed.");
        return workoutProgramManagers;
    }

    public WorkoutProgramManager getWorkoutProgramManager(String name) {
        WorkoutProgramManager manager = workoutProgramManagers.stream()
                .filter(workoutProgramManager -> workoutProgramManager.getName().equals(name))
                .findFirst()
                .orElse(null);
        System.out.println("WorkoutProgramManager accessed: " + name);
        return manager;
    }

    public void addWorkoutProgramManager(WorkoutProgramManager workoutProgramManager) {
        this.workoutProgramManagers.add(workoutProgramManager);
        System.out.println("WorkoutProgramManager added: " + workoutProgramManager.getName());
    }

    public void removeWorkoutProgramManager(WorkoutProgramManager workoutProgramManager) {
        this.workoutProgramManagers.remove(workoutProgramManager);
        System.out.println("WorkoutProgramManager removed: " + workoutProgramManager.getName());
    }
}