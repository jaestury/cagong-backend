package kr.ac.cnu.swacademy.cagong.dto;

import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CafeResponseDto {
    private Long id;
    private String name;
    private String address;
    private Double longitude;
    private Double latitude;
    private Double averagePrice;
    private Double averageScoreInNaver;
    private Integer seatSelectionCountInNaver;
    private Integer concentrationSelectionCountInNaver;

    private CafeResponseDto(){

    }

    public CafeResponseDto(Cafe cafe, String name, String address, Double averagePrice, Integer concentrationSelectionCountInNaver){
        this.id = cafe.getId();
        this.name = name;
        this.address = address;
        this.longitude = cafe.getLongitude();
        this.latitude = cafe.getLatitude();
        this.averagePrice = averagePrice;
        this.averageScoreInNaver = cafe.getAverageScoreInNaver();
        this.seatSelectionCountInNaver = cafe.getSeatSelectionCountInNaver();
        this.concentrationSelectionCountInNaver = concentrationSelectionCountInNaver;
    }
}
