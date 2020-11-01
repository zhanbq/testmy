package com.zhanbq;

import com.sun.tools.javac.parser.ParserFactory;

public class CompileTest {
    ParserFactory parserFactory;
    public static void main(String[] args) {
        System.out.println("zhanboqi say hello!");
        args = new String[1];
        args[0] = "F:\\code-lianxi2\\testmy\\java-test\\src\\main\\java\\com\\zhanbq\\Test.java";


        com.sun.tools.javac.main.Main compiler =
                new com.sun.tools.javac.main.Main("javac");
        System.exit(compiler.compile(args).exitCode);
    }
}
