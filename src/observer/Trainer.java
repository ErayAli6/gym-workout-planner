package observer;

import strategy.WorkoutProgram;

public class Trainer implements TrainerObserver {

    private String name;

    public Trainer(String name) {
        this.name = name;
        System.out.println("Trainer " + name + " created");
    }

    @Override
    public void update(WorkoutProgram workoutProgram) {
        System.out.println("Trainer " + name + " received a new workout program: " + workoutProgram.getExercises());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
