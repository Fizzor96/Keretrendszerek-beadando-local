package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParagraphDto {

    private int id;

    private int paragraph_num;

    private String plaintext;

    private int character_id;

    private int chapter_id;
}
