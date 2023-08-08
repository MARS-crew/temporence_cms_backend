package mars.temporence.service.impl;

import lombok.RequiredArgsConstructor;
import mars.temporence.repository.CharacterJpaRepository;
import mars.temporence.service.CharacterService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {
    private final CharacterJpaRepository characterJpaRepository;
}