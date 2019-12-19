package com.maxwit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationServiceTest {
    @Autowired
    private OperationService operationService;

    @Test
    public void testAdd() {
        assertEquals(Integer.valueOf(33), operationService.add(11, 22));
    }
}
