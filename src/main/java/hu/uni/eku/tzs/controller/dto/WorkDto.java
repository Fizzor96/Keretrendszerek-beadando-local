package hu.uni.eku.tzs.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkDto {

    private int id;

    private String title;

    private String long_title;

    private int date;

    private String genre_type;
}
