package org.iths.repzillabe.workout.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.iths.repzillabe.user.model.User;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workout")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String notes;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @CreationTimestamp
    private LocalDateTime updatedAt;

}
