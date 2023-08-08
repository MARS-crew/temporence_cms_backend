package mars.temporence.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mars.temporence.service.UserSkinService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user/skin")
@RequiredArgsConstructor
@Tag(name = "User Skin API", description = "유저의 캐릭터 스킨 관련 API")
public class UserSkinController {
    private final UserSkinService userSkinService;
}
