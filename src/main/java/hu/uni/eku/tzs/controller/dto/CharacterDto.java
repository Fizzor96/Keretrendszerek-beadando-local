package hu.uni.eku.tzs.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDto {

    private int id;

    private String char_name;

    private String abbrev;

    private String description;

}
