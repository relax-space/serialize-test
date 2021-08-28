package com.sample;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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

@Tag("group4")
@Execution(ExecutionMode.CONCURRENT)
public class ListTest {
    final static int count = 1000000;
    final static List<List<IpBTaobaoOrder>> ipBTaobaoOrders = Data.getBaseListData(count, 200);

    @Test
    public void testList1() {
        try {
            Instant start = Instant.now();

            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                byte[] b1 = JSONObject.toJSONBytes(ipBTaobaoOrderList);
                JSONArray bb = (JSONArray) JSONObject.parse(b1);
                List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList1 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList2() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));
                JSONArray b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString());
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList2 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList3() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));
                List<IpBTaobaoOrder> b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList3 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList4() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));
                JSONArray bb = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString());
                List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList4 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList5() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                JSONArray jsonArray = JSONObject.parseArray(JSONObject.toJSONString(ipBTaobaoOrderList));
                byte[] b1 = ObjectUtil.objectSerialize(jsonArray);
                JSONArray bb = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString());
                List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList5 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList6() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                JSONArray jsonArray = JSONObject.parseArray(JSONObject.toJSONString(ipBTaobaoOrderList));
                byte[] b1 = ObjectUtil.objectSerialize(jsonArray);
                List<IpBTaobaoOrder> b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList6 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
    public void testList7() {
        try {
            Instant start = Instant.now();
            for (List<IpBTaobaoOrder> ipBTaobaoOrderList : ipBTaobaoOrders) {
                byte[] b1 = ObjectUtil.objectSerialize(ipBTaobaoOrderList);
                List<IpBTaobaoOrder> b2 = (List<IpBTaobaoOrder>) ObjectUtil.objectDeserialize(b1);
//                System.out.println(b2);
            }
            Instant finish = Instant.now();
            System.out.printf("Test testList7 finished, spent %s seconds%n", Duration.between(start, finish).getSeconds());
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        }
    }

}

