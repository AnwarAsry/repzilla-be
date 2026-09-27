package org.iths.repzillabe.workoutexercise.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.iths.repzillabe.exercise.model.Exercise;
import org.iths.repzillabe.workout.model.Workout;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workoutexercise")
@Entity
public class WorkoutExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;
    private int sets;
    private int reps;
    private int weight;
}
