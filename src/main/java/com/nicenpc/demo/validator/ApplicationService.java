package com.nicenpc.demo.validator;

public interface ApplicationService<T1, T2> {
    T2 execute(T1 command);
}
