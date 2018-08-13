package com.scarlatti.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Monday, 8/13/2018
 */
@Component
public class App implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private Lib2 lib2;

    public App(Lib2 lib2) {
        this.lib2 = lib2;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("App.run() args = [{}]", args);

        // invoke each of the components from the "child" apps.
        new Lib1().run();

        // injected from autoconfig
        lib2.run();
    }
}
