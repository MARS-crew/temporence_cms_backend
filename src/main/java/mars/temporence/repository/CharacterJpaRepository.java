package mars.temporence.repository;

import mars.temporence.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterJpaRepository extends JpaRepository<Character, Long> {
}
