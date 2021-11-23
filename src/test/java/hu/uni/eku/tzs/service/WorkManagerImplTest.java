package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.controller.dto.WorkDto;
import hu.uni.eku.tzs.controller.dto.WorkMapper;
import hu.uni.eku.tzs.controller.WorkController;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

@ExtendWith(MockitoExtension.class)
public class WorkManagerImplTest {

    @Mock
    WorkManager workManager;

    @Mock
    WorkMapper workMapper;

    @InjectMocks
    WorkController workController;

    @Test
    void readAllHappyPath() {
        when(workManager.readAll()).thenReturn(List.of(TestDataProvider.getJohnDoe()));
    }
}
