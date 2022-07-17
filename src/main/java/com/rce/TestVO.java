package com.rce;

public class TestVO {

    private int id;
    private Test2VO filedObj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Test2VO getFiledObj() {
        return filedObj;
    }

    public void setFiledObj(Test2VO filedObj) {
        this.filedObj = filedObj;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "id=" + id +
                ", filedClass=" + filedObj +
                '}';
    }
}
