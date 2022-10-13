package kr.ac.cnu.swacademy.cagong.controller.api;


import kr.ac.cnu.swacademy.cagong.dto.CafeRequestDto;
import kr.ac.cnu.swacademy.cagong.service.CafeSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cafes")
public class CafeSearchApiController {

    private final CafeSearchService cafeSearchService;

    public CafeSearchApiController(CafeSearchService cafeSearchService) {
        this.cafeSearchService = cafeSearchService;
    }

    @GetMapping("/search=cafe-name")
    public String findByName(@RequestBody CafeRequestDto requestDto){
        return cafeSearchService.findByName(requestDto);
    }
}
