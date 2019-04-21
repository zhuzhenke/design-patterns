package com.design.pattern.facade;

import com.design.pattern.facade.systems.Computer;
import com.design.pattern.facade.systems.Light;
import com.design.pattern.facade.systems.VoiceBox;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class HomeTheater {
    private Computer computer;
    private Light light;
    private VoiceBox voiceBox;

    public HomeTheater(Computer computer, Light light, VoiceBox voiceBox) {
        this.computer = computer;
        this.light = light;
        this.voiceBox = voiceBox;
    }

    public void startMovie() {
        System.out.println("starting Movie...");

        computer.turnOn();
        computer.chooseMovie();

        voiceBox.turnUpVolume();

        light.turnOff();
    }

    public void endMovie() {
        System.out.println("ending Movie...");

        light.turnOn();

        voiceBox.turnDownVolume();

        computer.turnOff();
    }
}
