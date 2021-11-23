package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.ParagraphRepository;
import hu.uni.eku.tzs.dao.entity.ParagraphEntity;
import hu.uni.eku.tzs.model.Paragraph;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ParagraphManagerImplTest {

    @Mock
    ParagraphRepository paragraphRepository;

    @InjectMocks
    ParagraphManagerImpl service;

    private static class TestDataProvider {

        public static final int PARAGRAPH1_ID=1;

        public static final int PARAGRAPH2_ID=2;

        public static final int UNKNOWN_ID=33;

        public static Paragraph getTestParagraph1() {
            return new Paragraph(
                    PARAGRAPH1_ID,
                    22,
                    "Valami szoveg 1",
                    11,
                    3);
        }

        public static ParagraphEntity getTestParagraph1Entity() {
            return ParagraphEntity.builder()
                    .id(PARAGRAPH1_ID)
                    .paragraphNum(22)
                    .plaintext("Valami szoveg 1")
                    .characterId(11)
                    .chapterId(3)
                    .build();
        }

        public static Paragraph getTestParagraph2() {
            return new Paragraph(
                    PARAGRAPH2_ID,
                    11,
                    "Valami szoveg 2",
                    33,
                    5);
        }

        public static ParagraphEntity getTestParagraph2Entity() {
            return ParagraphEntity.builder()
                    .id(PARAGRAPH2_ID)
                    .paragraphNum(11)
                    .plaintext("Valami szoveg 2")
                    .characterId(33)
                    .chapterId(5)
                    .build();
        }
    }
}
