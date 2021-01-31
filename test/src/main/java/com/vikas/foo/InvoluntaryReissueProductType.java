package com.vikas.foo;

public enum InvoluntaryReissueProductType implements Product
{
    NONE_SPECIFIC,
    SCHEDULE_CHANGE,
    REACCOMM,
    OSO,
    DENIED_BOARDING,
    DYNAMIC_REACOMM,
    MIDPOINT_CHANGE;

    public String value()
    {
        return name();
    }

    public static InvoluntaryReissueProductType fromValue(String v)
    {
        return valueOf(v);
    }
}
