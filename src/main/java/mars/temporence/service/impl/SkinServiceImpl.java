package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.skin.SkinJpaRepository;
import mars.temporence.service.SkinService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SkinServiceImpl implements SkinService {
    private final SkinJpaRepository skinJpaRepository;
}
