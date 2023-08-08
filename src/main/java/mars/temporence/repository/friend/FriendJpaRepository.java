package mars.temporence.repository.friend;

import mars.temporence.domain.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendJpaRepository extends JpaRepository<Friend, Long> {
}
