package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.entity.CharacterEntity;
import hu.uni.eku.tzs.model.Character;
import hu.uni.eku.tzs.dao.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CharacterManagerImplTest {

    @Mock
    CharacterRepository characterRepository;

    @InjectMocks
    CharacterManagerImpl service;

    private static class TestDataProvider {

        private static final int CHARACTER1_ID=1;

        private static final int CHARACTER2_ID=2;

        private static final int UNKNOWN_ID=33;

        public static Character getTestParagraph1() {
            return new Character(
                    CHARACTER1_ID,
                    "Character Name 1",
                    "Abbrev 1",
                    "Description 1"
                    );
        }

        public static CharacterEntity getTestCharacterEntity1() {
            return CharacterEntity.builder()
                    .id(CHARACTER1_ID)
                    .charName("Character Name 1")
                    .abbrev("Abbrev 1")
                    .description("Description 1")
                    .build();
        }

        public static Character getTestParagraph2() {
            return new Character(
                    CHARACTER2_ID,
                    "Character Name 2",
                    "Abbrev 2",
                    "Description 2"
            );
        }

        public static CharacterEntity getTestCharacterEntity2() {
            return CharacterEntity.builder()
                    .id(CHARACTER2_ID)
                    .charName("Character Name 2")
                    .abbrev("Abbrev 2")
                    .description("Description 2")
                    .build();
        }
    }
}
