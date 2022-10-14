package kr.ac.cnu.swacademy.cagong.dto;

import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class CafeNameRequestDto {
    private String name;

    @Builder
    public CafeNameRequestDto(String name){
        this.name = name;
    }

    public Cafe toEntity(){
        return Cafe
                .builder()
                .name(name)
                .build();
    }
}
