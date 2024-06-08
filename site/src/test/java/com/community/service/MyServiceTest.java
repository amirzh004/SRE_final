package com.community.service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    private MyRepository myRepository;

    @InjectMocks
    private MyService myService;

    @Test
    public void testFindById() {
        MyEntity entity = new MyEntity(1L, "Test");
        when(myRepository.findById(1L)).thenReturn(Optional.of(entity));

        MyEntity result = myService.findById(1L);

        assertEquals("Test", result.getName());
    }
}
