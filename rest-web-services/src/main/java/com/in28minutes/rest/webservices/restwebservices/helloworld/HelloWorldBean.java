package com.in28minutes.rest.webservices.restwebservices.helloworld;

public class HelloWorldBean {
    String msg;
    int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public HelloWorldBean(String omer) {
        msg = omer;
        a=1;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
