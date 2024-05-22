package strategy;

public class WorkoutProgramManager {

    private WorkoutProgram workoutProgram;

    public void setWorkoutProgram(WorkoutProgram workoutProgram) {
        this.workoutProgram = workoutProgram;
        System.out.println("Workout program set to: " + workoutProgram.getName());
        workoutProgram.notifyObservers();
    }

    public void addExercise(String exercise) {
        workoutProgram.addExercise(exercise);
        System.out.println("Exercise added: " + exercise);
        workoutProgram.notifyObservers();
    }

    public void removeExercise(String exercise) {
        workoutProgram.removeExercise(exercise);
        System.out.println("Exercise removed: " + exercise);
        workoutProgram.notifyObservers();
    }
}
