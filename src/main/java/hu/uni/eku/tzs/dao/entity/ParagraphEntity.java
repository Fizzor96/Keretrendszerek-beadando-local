package hu.uni.eku.tzs.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paragraphs")
public class ParagraphEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "ParagraphNum")
    private int paragraph_num;

    @Column(name = "PlainText")
    private String plaintext;

    @Column(name = "character_id")
    private int character_id;

    @Column(name = "chapter_id")
    private int chapter_id;
}
