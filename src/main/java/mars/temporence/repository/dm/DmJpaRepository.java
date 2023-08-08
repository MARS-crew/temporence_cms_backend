package mars.temporence.repository.dm;

import mars.temporence.domain.Dm;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DmJpaRepository extends JpaRepository<Dm, Long> {
}
