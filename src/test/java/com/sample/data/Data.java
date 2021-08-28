package com.sample.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private final static String base="测试测试";

    public static List<IpBTaobaoOrder> getBaseData(int count){
        List<IpBTaobaoOrder> ipBTaobaoOrders = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ipBTaobaoOrders.add(getObj(i));
        }
        return ipBTaobaoOrders;
    }


    public static List<List<IpBTaobaoOrder>> getBaseListData(int count,int split){
        List<IpBTaobaoOrder> ipBTaobaoOrders=getBaseData(count);
        return ListUtil.split(ipBTaobaoOrders,split);
    }

    public static IpBTaobaoOrder getObj(int i){
        String finalI = String.format("%s%s",base, i);
        IpBTaobaoOrder ipBTaobaoOrder = new IpBTaobaoOrder();
        ipBTaobaoOrder.setAbnormalType(finalI);
        ipBTaobaoOrder.setAlipayId(finalI);
        ipBTaobaoOrder.setAlipayNo(finalI);
        ipBTaobaoOrder.setBizCode(finalI);
        ipBTaobaoOrder.setBuyerAlipayNo(finalI);

        ipBTaobaoOrder.setBuyerArea(finalI);
        ipBTaobaoOrder.setBuyerEmail(finalI);
        ipBTaobaoOrder.setBuyerMessage(finalI);
        ipBTaobaoOrder.setBuyerNick(finalI);
        ipBTaobaoOrder.setBuyerRate(finalI);

        ipBTaobaoOrder.setCloudStore(finalI);
        ipBTaobaoOrder.setCodStatus(finalI);
        ipBTaobaoOrder.setCpCShopEcode(finalI);
        ipBTaobaoOrder.setCutoffminutes(finalI);
        ipBTaobaoOrder.setDeliverycps(finalI);

        ipBTaobaoOrder.setErphold(finalI);
        ipBTaobaoOrder.setGatherlastcenter(finalI);
        ipBTaobaoOrder.setGatherstation(finalI);
        ipBTaobaoOrder.setHasYfx(finalI);
        ipBTaobaoOrder.setInvoiceName(finalI);

        ipBTaobaoOrder.setLgAgingType(finalI);
        ipBTaobaoOrder.setMarkDesc(finalI);
        ipBTaobaoOrder.setModifierename(finalI);
        ipBTaobaoOrder.setNumIid(finalI);
        ipBTaobaoOrder.setNutFeature(finalI);

        ipBTaobaoOrder.setO2oShopid(finalI);
        ipBTaobaoOrder.setO2oShopName(finalI);
        ipBTaobaoOrder.setOmnichannelParam(finalI);
        ipBTaobaoOrder.setOrdertype(finalI);
        ipBTaobaoOrder.setOwnerename(finalI);

        ipBTaobaoOrder.setOwnername(finalI);
        ipBTaobaoOrder.setPicPath(finalI);
        ipBTaobaoOrder.setPlatformFlag(finalI);
        ipBTaobaoOrder.setReceiverAddress(finalI);
        ipBTaobaoOrder.setReceiverCity(finalI);

        ipBTaobaoOrder.setReceiverDistrict(finalI);
        ipBTaobaoOrder.setReceiverAddress(finalI);
        ipBTaobaoOrder.setReceiverMobile(finalI);
        ipBTaobaoOrder.setReceiverName(finalI);
        ipBTaobaoOrder.setReceiverPhone(finalI);

        ipBTaobaoOrder.setReceiverState(finalI);
        ipBTaobaoOrder.setReceiverZip(finalI);
        ipBTaobaoOrder.setReserveVarchar01(finalI);
        ipBTaobaoOrder.setReserveVarchar02(finalI);

        ipBTaobaoOrder.setReserveVarchar03(finalI);
        ipBTaobaoOrder.setReserveVarchar04(finalI);
        ipBTaobaoOrder.setReserveVarchar05(finalI);
        ipBTaobaoOrder.setReserveVarchar06(finalI);
        ipBTaobaoOrder.setReserveVarchar07(finalI);

        ipBTaobaoOrder.setReserveVarchar08(finalI);
        ipBTaobaoOrder.setReserveVarchar09(finalI);
        ipBTaobaoOrder.setReserveVarchar10(finalI);
        ipBTaobaoOrder.setSellerCanRate(finalI);
        ipBTaobaoOrder.setSellerFlag(finalI);

        ipBTaobaoOrder.setSellerMemo(finalI);
        ipBTaobaoOrder.setSellerNick(finalI);
        ipBTaobaoOrder.setServiceTag(finalI);
        ipBTaobaoOrder.setServiceType(finalI);
        ipBTaobaoOrder.setShippingType(finalI);
        return  ipBTaobaoOrder;
    }
}
