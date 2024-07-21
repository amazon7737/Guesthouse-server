package org.example.guesthouse.Reservation.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingUserDataRepository extends JpaRepository<WaitingUser, Long> {
}
