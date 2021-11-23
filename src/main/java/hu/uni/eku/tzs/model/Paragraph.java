package hu.uni.eku.tzs.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paragraph {

    private int id;

    private int paragraph_num;

    private String plaintext;

    private int character_id;

    private int chapter_id;

}
