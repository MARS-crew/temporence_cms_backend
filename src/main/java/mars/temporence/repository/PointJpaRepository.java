package mars.temporence.repository;

import mars.temporence.domain.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointJpaRepository extends JpaRepository<Point, Long> {
}
