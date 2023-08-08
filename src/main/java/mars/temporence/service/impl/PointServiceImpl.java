package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.PointJpaRepository;
import mars.temporence.service.PointService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PointServiceImpl implements PointService {
    private final PointJpaRepository pointJpaRepository;
}
