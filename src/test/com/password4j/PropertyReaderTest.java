package com.password4j;

import org.junit.Test;

public class PropertyReaderTest
{
    @Test
    public void test()
    {
        System.out.println(PropertyReader.readString("mia.prop"));
    }
}