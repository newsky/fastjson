package com.alibaba.json.bvt;

import java.awt.Point;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PointSerializer;

public class PointTest extends TestCase {

    public void test_color() throws Exception {
        JSONSerializer serializer = new JSONSerializer();
        Assert.assertEquals(PointSerializer.class, serializer.getObjectWriter(Point.class).getClass());
        
        Point point = new Point(3, 4);
        String text = JSON.toJSONString(point);

        Point point2 = JSON.parseObject(text, Point.class);

        Assert.assertEquals(point, point2);
    }
}
