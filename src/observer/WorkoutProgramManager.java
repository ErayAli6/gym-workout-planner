package observer;

import strategy.WorkoutProgram;

import java.util.ArrayList;
import java.util.List;

public class WorkoutProgramManager implements ManagerObservable {

    private final String name;

    private final List<TrainerObserver> trainers;

    private WorkoutProgram workoutProgram;

    public WorkoutProgramManager(String name) {
        this.name = name;
        this.trainers = new ArrayList<>();
        System.out.println("Workout program manager created: " + name);
    }

    @Override
    public void subscribe(TrainerObserver observer) {
        trainers.add(observer);
        observer.setWorkoutProgramManager(this);
    }

    @Override
    public void unsubscribe(TrainerObserver observer) {
        trainers.remove(observer);
        observer.setWorkoutProgramManager(null);
    }

    @Override
    public String getUpdate() {
        return workoutProgram.getExercises().toString();
    }

    @Override
    public void notifyObservers() {
        trainers.forEach(TrainerObserver::update);
    }

    public void setWorkoutProgram(WorkoutProgram workoutProgram) {
        this.workoutProgram = workoutProgram;
        System.out.println("Workout program set to: " + workoutProgram.getName());
        notifyObservers();
    }

    public void addExercise(String exercise) {
        workoutProgram.addExercise(exercise);
        System.out.println("Exercise added: " + exercise);
        notifyObservers();
    }

    public void removeExercise(String exercise) {
        workoutProgram.removeExercise(exercise);
        System.out.println("Exercise removed: " + exercise);
        notifyObservers();
    }

    public String getName() {
        return name;
    }
}
