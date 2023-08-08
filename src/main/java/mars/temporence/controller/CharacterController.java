package mars.temporence.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mars.temporence.service.CharacterService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
@Tag(name = "Character API", description = "캐릭터 관련 API")
public class CharacterController {
    private final CharacterService characterService;
}
