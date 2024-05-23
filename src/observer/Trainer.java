package observer;

public class Trainer implements TrainerObserver {


    private Observable workoutProgram;

    private final String name;

    public Trainer(String name) {
        this.name = name;
        System.out.println("Trainer " + name + " created");
    }

    @Override
    public void update() {
        System.out.println("Trainer " + name + " received a new workout program: " + workoutProgram.getUpdate());
    }

    @Override
    public void setWorkoutProgramManager(Observable workoutProgramManager) {
        this.workoutProgram = workoutProgramManager;
    }
}
