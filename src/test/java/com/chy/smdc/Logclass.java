package com.chy.smdc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Logclass {

    private final Logger logger = LoggerFactory.getLogger(Logclass.class);


    @Test
    public void test1() {
        logger.debug("sssss");
        logger.info("jkdhjsla");
        logger.error("sdhsjkdksdsalkd");
    }


}
