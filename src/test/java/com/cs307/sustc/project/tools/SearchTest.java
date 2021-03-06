package com.cs307.sustc.project.tools;


import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SearchTest {
    @Autowired
    Search search;

    @Test
    public void searchTest(){
        System.out.println(search.search(List.of("ip","hone"),1));
    }

    @Test
    public void test(){
        System.out.println(RandomStringUtils.randomAlphanumeric(45));
    }
}
