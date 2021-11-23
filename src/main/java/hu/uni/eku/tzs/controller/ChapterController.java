package hu.uni.eku.tzs.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "chapters")
@RequestMapping("/chapters")
@RestController
@RequiredArgsConstructor
public class ChapterController {

}
