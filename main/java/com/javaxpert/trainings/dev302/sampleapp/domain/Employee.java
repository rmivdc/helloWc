package com.javaxpert.trainings.dev302.sampleapp.domain;

import com.javaxpert.trainings.dev302.sampleapp.tools.Formatter;

public class Employee {
    public String doReport(){
        return Formatter.formatFrom(this);
    }
}
op