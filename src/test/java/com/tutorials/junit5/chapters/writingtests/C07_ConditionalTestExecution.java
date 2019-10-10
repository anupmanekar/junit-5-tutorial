package com.tutorials.junit5.chapters.writingtests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.logging.Logger;

public class C07_ConditionalTestExecution {

    Logger logger = Logger.getLogger(C07_ConditionalTestExecution.class.getName());

    @Test
    @EnabledOnOs(OS.MAC)
    void onlyOnMacOs() {
        logger.info("Enabled only on MAC");
    }

    @TestOnMac
    void testOnMac() {
        logger.info("Enabled only on MAC");
    }

    @Test
    @EnabledOnOs({ OS.LINUX, OS.MAC })
    void onLinuxOrMac() {
        logger.info("Enabled only on MAC or Linux");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void notOnWindows() {
        logger.info("Disabled only on windows");
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Test
    @EnabledOnOs(OS.MAC)
    @interface TestOnMac {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void onlyOnJava8() {
        logger.info("Enabled only for Java 8");
    }

    @Test
    @EnabledOnJre({ JRE.JAVA_9, JRE.JAVA_10 })
    void onJava9Or10() {
        logger.info("Enabled only for Java 9 and 10");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_9)
    void notOnJava9() {
        logger.info("Disabled only for Java 9");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void onlyOn64BitArchitectures() {
        // ...
    }

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void notOnCiServer() {
        // ...
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void onlyOnStagingServer() {
        // ...
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
    void notOnDeveloperWorkstation() {
        // ...
    }
}
