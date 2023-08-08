package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.user.UserJpaRepository;
import mars.temporence.service.DmService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DmServiceImpl implements DmService {
    private final UserJpaRepository userJpaRepository;
}
