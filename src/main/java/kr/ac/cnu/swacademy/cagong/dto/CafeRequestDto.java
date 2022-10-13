package kr.ac.cnu.swacademy.cagong.dto;

import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class CafeRequestDto {
    @NotBlank
    private String name;

    @NotBlank
    private String address;

    public Cafe toEntity(){
        return Cafe
                .builder()
                .name(name)
                .address(address)
                .build();
    }
}
