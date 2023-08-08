package mars.temporence.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import mars.temporence.service.DmService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dm")
@RequiredArgsConstructor
@Tag(name = "DM API", description = "DM 관련 API")
public class DmController {

    private final DmService dmService;
}
