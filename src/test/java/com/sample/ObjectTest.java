package com.sample;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.sample.data.Data;
import com.sample.data.IpBTaobaoOrder;
import com.sample.data.ObjectUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@Tag("group1")
@Execution(ExecutionMode.CONCURRENT)
public class ObjectTest {
    final static int count = 1000000;
    final static List<IpBTaobaoOrder> ipBTaobaoOrders = Data.getBaseData(count);

    @Test
    public void testObj1() {
        try {
            Instant start = Instant.now();

            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                byte[] b1 = JSONObject.toJSONBytes(ipBTaobaoOrder);
                IpBTaobaoOrder b2 = JSONObject.parseObject(b1, IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj1 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj2() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));
                JSONObject b2 = JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString());
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj2 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj3() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));
                IpBTaobaoOrder b2 = JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj3 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj4() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));
                JSONObject bb = JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString());
                IpBTaobaoOrder b2 = JSONObject.toJavaObject(bb, IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj4 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj5() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(ipBTaobaoOrder), Feature.OrderedField);
                byte[] b1 = ObjectUtil.objectSerialize(jsonObject);
                JSONObject bb = JSON.parseObject(ObjectUtil.objectDeserialize(b1).toString());
                IpBTaobaoOrder b2 = JSONObject.toJavaObject(bb, IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj5 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj6() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(ipBTaobaoOrder), Feature.OrderedField);
                byte[] b1 = ObjectUtil.objectSerialize(jsonObject);
                IpBTaobaoOrder b2 = JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);
//                System.out.println(b2);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj6 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testObj7() {
        try {
            Instant start = Instant.now();
            for (IpBTaobaoOrder ipBTaobaoOrder : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(ipBTaobaoOrder);
                IpBTaobaoOrder b2 = (IpBTaobaoOrder) ObjectUtil.objectDeserialize(b1);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testObj7 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

}
