package ch05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {

    public LifeCycleTest() {
        System.out.println("new Lifecycle Test");
    }

    @BeforeEach
    void setUp(){
        System.out.println("setUp");
    }

    @Test
    void a(){
        System.out.println("A");
    }

    @Test
    void b(){
        System.out.println("B");
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearDown");
    }
}
