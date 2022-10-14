package kr.ac.cnu.swacademy.cagong.service;

import kr.ac.cnu.swacademy.cagong.dto.CafeNameRequestDto;
import kr.ac.cnu.swacademy.cagong.dto.CafeResponseDto;
import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import kr.ac.cnu.swacademy.cagong.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CafeSearchService {
    private final CafeRepository cafeRepository;

    public CafeResponseDto findByName(String name) {
        Cafe entity = cafeRepository.findByName(name).orElseThrow(() ->
                new IllegalArgumentException("이름에 맞는 매장이 없습니다. name=" + name));
        return new CafeResponseDto(entity);
    }
}
