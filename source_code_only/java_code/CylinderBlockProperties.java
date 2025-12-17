package com.bodercorp.rubber_tires.utilityclasses;

public class CylinderBlockProperties {
    private int resolution;
    private float diameter;
    private float height;
    private float offset;

    public CylinderBlockProperties(int resolution, float diameter, float height, float offset) {
        this.resolution = resolution;
        this.diameter = diameter;
        this.height = height;
        this.offset = offset;
    }

    public int getResolution()
    {
        return resolution;
    }

    public float getDiameter()
    {
        return diameter;
    }

    public float getHeight()
    {
        return height;
    }

    public float getOffset()
    {
        return offset;
    }
}