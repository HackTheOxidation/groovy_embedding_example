package io.github.hacktheoxidation;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        var scriptsDir = new File("./scripts");
        System.out.println(scriptsDir.getAbsolutePath());
        var urls = new URL[] {scriptsDir.toURI().toURL()};
        var binding = new Binding();
        var groovyEngine = new GroovyScriptEngine(urls);
        try {
            groovyEngine.run("MyScript.groovy", binding);
        } catch (ResourceException | groovy.util.ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}