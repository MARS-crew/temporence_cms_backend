package mars.temporence.repository;

import mars.temporence.domain.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogJpaRepository extends JpaRepository<Log, Long> {
}
