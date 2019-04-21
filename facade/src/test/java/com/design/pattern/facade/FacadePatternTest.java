package com.design.pattern.facade;

import com.design.pattern.facade.systems.Computer;
import com.design.pattern.facade.systems.Light;
import com.design.pattern.facade.systems.VoiceBox;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class FacadePatternTest {
    @Test
    public void testMovieProcesses() {
        HomeTheater homeTheater = new HomeTheater(new Computer(),
                new Light(),
                new VoiceBox());

        homeTheater.startMovie();

        homeTheater.endMovie();
    }
}
