package kr.ac.cnu.swacademy.cagong.service;

import kr.ac.cnu.swacademy.cagong.dto.CafeResponseDto;
import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import kr.ac.cnu.swacademy.cagong.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CafeSearchService {
    private final CafeRepository cafeRepository;

    public List<CafeResponseDto> findByName(String name){
        return cafeRepository.findByNameLike("%" + name + "%").stream()
                .map(CafeResponseDto::new)
                .collect(Collectors.toList());
    }
}
