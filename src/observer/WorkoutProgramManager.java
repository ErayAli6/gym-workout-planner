package observer;

import strategy.WorkoutProgram;

import java.util.ArrayList;
import java.util.List;

public class WorkoutProgramManager implements ManagerObservable {

    private final String name;

    private final List<TrainerObserver> observers;

    private WorkoutProgram workoutProgram;

    public WorkoutProgramManager(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        System.out.println("Workout program manager created: " + name);
    }

    @Override
    public void subscribe(TrainerObserver observer) {
        observers.add(observer);
        observer.setWorkoutProgramManager(this);
    }

    @Override
    public void unsubscribe(TrainerObserver observer) {
        observers.remove(observer);
        observer.setWorkoutProgramManager(null);
    }

    @Override
    public String getUpdate() {
        return workoutProgram.getExercises().toString();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(TrainerObserver::update);
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
