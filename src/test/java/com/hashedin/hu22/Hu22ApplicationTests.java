package com.hashedin.hu22;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Hu22Application.class}, loader = AnnotationConfigContextLoader.class)
//@Transactional
public class Hu22ApplicationTests {




}
