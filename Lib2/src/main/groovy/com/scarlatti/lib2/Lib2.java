package com.scarlatti.lib2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Monday, 8/13/2018
 */
public class Lib2 implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(Lib2.class);

    @Override
    public void run() {
        log.info("Lib2.run()");
    }
}
