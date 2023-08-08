package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.userSkin.UserSkinJpaRepository;
import mars.temporence.service.UserSkinService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSkinServiceImpl implements UserSkinService {
    private final UserSkinJpaRepository userSkinJpaRepository;
}
