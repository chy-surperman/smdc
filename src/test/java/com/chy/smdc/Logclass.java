package com.chy.smdc;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Logclass {


    @Test
    public void test1() {
        log.debug("sssss");
        log.info("chy");
        log.error("sdhsjkdksdsalkd");
    }
}
