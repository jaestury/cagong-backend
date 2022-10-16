package kr.ac.cnu.swacademy.cagong.controller.api;

import kr.ac.cnu.swacademy.cagong.dto.CafeResponseDto;
import kr.ac.cnu.swacademy.cagong.service.CafeSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CafeSearchApiController {

    private final CafeSearchService cafeSearchService;

    @GetMapping("/api/cafes")
    public List<CafeResponseDto> cafe(@RequestParam String name){
        return cafeSearchService.findByName(name);
    }
}
