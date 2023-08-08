package mars.temporence.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import mars.temporence.service.LogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/log")
@RequiredArgsConstructor@Tag(name = "Log API", description = "로그 관련 API")
public class LogController {

    private final LogService logService;

}
