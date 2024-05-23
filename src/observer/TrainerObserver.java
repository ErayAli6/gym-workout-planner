package observer;

public interface TrainerObserver {

    void update();

    void setWorkoutProgramManager(Observable workoutProgram);
}
