package observer;

import strategy.WorkoutProgram;

public interface TrainerObserver {

    void update(WorkoutProgram workoutProgram);

    String getName();
}
