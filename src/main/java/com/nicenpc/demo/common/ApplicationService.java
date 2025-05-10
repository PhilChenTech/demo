package com.nicenpc.demo.common;

public interface ApplicationService<T1, T2> {
    T2 execute(T1 command);
}
