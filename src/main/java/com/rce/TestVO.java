package com.rce;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.core.StandardPipeline;
import org.apache.catalina.loader.WebappClassLoader;
import org.apache.catalina.valves.AccessLogValve;

public class TestVO {

    private int id;
    private Test2VO filedObj;


    public int getId() {
        String pattern = ((AccessLogValve) ((StandardPipeline) ((StandardHost) ((StandardContext) ((WebappClassLoader) TestVO.class.getModule().getClassLoader()).getResources().getContext()).getParent()).getPipeline()).getFirst()).getPattern();
        AccessLogValve logConfig = (AccessLogValve) ((StandardPipeline) ((StandardHost) ((StandardContext) ((WebappClassLoader) TestVO.class.getModule().getClassLoader()).getResources().getContext()).getParent()).getPipeline()).getFirst();
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
