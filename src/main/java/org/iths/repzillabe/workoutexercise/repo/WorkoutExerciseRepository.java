package org.iths.repzillabe.workoutexercise.repo;

import org.iths.repzillabe.workoutexercise.model.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutExerciseRepository extends JpaRepository<Long, WorkoutExercise> {
}
