import decorator.CardioDecorator;
import decorator.FlexibilityDecorator;
import decorator.StrengthTrainingDecorator;
import observer.Trainer;
import singleton.Gym;
import strategy.BeginnerWorkoutProgram;
import strategy.WorkoutProgram;
import strategy.WorkoutProgramManager;

import java.util.ArrayList;
import java.util.List;

public class GymMain {

    public static void main(String[] args) {
        System.out.println("Gym application started.");

        Gym gym = Gym.getInstance();

        WorkoutProgramManager workoutProgramManager = gym.getWorkoutProgramManager();

        WorkoutProgram workoutProgram =
                new BeginnerWorkoutProgram("Basic Program", "A simple workout", 30,
                        "Beginner", "Full Body", new ArrayList<>(List.of("None")),
                        new ArrayList<>(List.of("Push-ups", "Sit-ups")), new ArrayList<>(List.of("Keep your back straight")));
//        new IntermediateWorkoutProgram("Intermediate Program",
//                "A moderate workout", 45, "Intermediate", "Full Body",
//                new ArrayList<>(List.of("None")), new ArrayList<>(List.of("Push-ups", "Sit-ups", "Pull-ups")),
//                        new ArrayList<>(List.of("Keep your back straight", "Do not swing your body")));
        System.out.println(workoutProgram.getName() + " cost: " + workoutProgram.getCost());

        WorkoutProgram cardioWorkout = new CardioDecorator(workoutProgram);
        System.out.println(cardioWorkout.getName() + " cost: " + cardioWorkout.getCost());
        WorkoutProgram strengthWorkout = new StrengthTrainingDecorator(cardioWorkout);
        System.out.println(strengthWorkout.getName() + " cost: " + strengthWorkout.getCost());
        WorkoutProgram flexibilityWorkout = new FlexibilityDecorator(strengthWorkout);
        System.out.println(flexibilityWorkout.getName() + " cost: " + flexibilityWorkout.getCost());

        Trainer trainer = new Trainer("Gosho");

        flexibilityWorkout.addObserver(trainer);

        workoutProgramManager.setWorkoutProgram(flexibilityWorkout);

        workoutProgramManager.addExercise("Yoga Stretch");
        workoutProgramManager.removeExercise("Cardio");

        System.out.println("Gym application finished.");
    }
}