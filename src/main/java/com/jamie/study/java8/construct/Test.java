package com.jamie.study.java8.construct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author baitao
 * @date 2018/9/19
 */
public class Test {

    private String ss;

    public Test() {
        System.out.println("Test无参数构造!");
    }

    public Test(String ss) {
        this.ss = ss;
        System.out.println("Test单参数构造!");
    }

    public Test(String ss1, String ss2) {
        this.ss = ss1;
        System.out.println("Test双参数构造!");
    }

    public static void main(String[] args) {
        List<String> ss = new ArrayList<String>(){{
            add("1");add("2");add("3");
        }};

        List<Test> tests = ss.stream().map(Test::new).collect(Collectors.toList());
        System.out.println(tests.size());
    }
}
