package com.zhanbq;


import com.sun.tools.javac.Main;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String classPath = "F:\\code-lianxi2\\testmy\\java-test\\src\\main\\java\\com\\zhanbq\\Test.java";

        String[] classPathArr = new String[1];
        classPathArr[0] = classPath;
        System.exit(compile(classPathArr));
    }
    public static int compile(String[] args) {
        com.sun.tools.javac.main.Main compiler =
                new com.sun.tools.javac.main.Main("javac");
        return compiler.compile(args).exitCode;
    }

}
