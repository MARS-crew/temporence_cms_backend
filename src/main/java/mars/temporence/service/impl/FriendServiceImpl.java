package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.user.UserJpaRepository;
import mars.temporence.service.FriendService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FriendServiceImpl implements FriendService {
    private final UserJpaRepository userJpaRepository;
}
