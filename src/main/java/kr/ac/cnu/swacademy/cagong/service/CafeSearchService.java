package kr.ac.cnu.swacademy.cagong.service;

import kr.ac.cnu.swacademy.cagong.dto.CafeRequestDto;
import kr.ac.cnu.swacademy.cagong.dto.CafeResponseDto;
import kr.ac.cnu.swacademy.cagong.repository.CafeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CafeSearchService {
    private final CafeRepository cafeRepository;

    public CafeSearchService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }



    }









}
