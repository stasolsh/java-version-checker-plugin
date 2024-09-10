package com.example.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * A Maven plugin to check and display the Java version installed on the machine.
 */
@Mojo(name = "check-java-version", defaultPhase = LifecyclePhase.COMPILE)
public class JavaVersionCheckerMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException {
        String javaVersion = System.getProperty("java.version");
        getLog().info("Java Version on this machine: " + javaVersion);
    }
}
