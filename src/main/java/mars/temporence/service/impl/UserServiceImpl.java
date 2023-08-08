package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.user.UserJpaRepository;
import mars.temporence.service.UserService;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserJpaRepository userJpaRepository;
}
