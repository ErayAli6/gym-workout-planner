package observer;

public class Trainer implements TrainerObserver {

    private ManagerObservable workoutProgram;

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
    public void setWorkoutProgramManager(ManagerObservable workoutProgramManager) {
        this.workoutProgram = workoutProgramManager;
    }
}
