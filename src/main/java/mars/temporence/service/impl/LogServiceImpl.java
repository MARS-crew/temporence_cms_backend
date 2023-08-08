package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.LogJpaRepository;
import mars.temporence.service.LogService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogJpaRepository logJpaRepository;
}
