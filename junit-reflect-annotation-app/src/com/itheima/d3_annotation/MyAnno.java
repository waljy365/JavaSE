package com.itheima.d3_annotation;

public @interface MyAnno {
    public String aa();

    public boolean bb() default false;

    public String[] cc();
}
