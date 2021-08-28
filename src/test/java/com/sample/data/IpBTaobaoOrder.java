package com.sample.data;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class IpBTaobaoOrder implements Serializable {
    @JSONField(name = "ID")
    private Long id;

    @JSONField(name = "AD_ORG_ID")
    private Long adOrgId;

    @JSONField(name = "AD_CLIENT_ID")
    private Long adClientId;

    @JSONField(name = "SHIPPING_TYPE")
    private String shippingType;

    @JSONField(name = "BUYER_EMAIL")
    private String buyerEmail;

    @JSONField(name = "ISREMIND")
    private Integer isremind;

    @JSONField(name = "YFX_FEE")
    private BigDecimal yfxFee;

    @JSONField(name = "BUYER_AREA")
    private String buyerArea;

    @JSONField(name = "BUYER_NICK")
    private String buyerNick;

    @JSONField(name = "ALIPAY_NO")
    private String alipayNo;

    @JSONField(name = "LG_AGING_TYPE")
    private String lgAgingType;

    @JSONField(name = "LG_AGING")
    private Date lgAging;

    @JSONField(name = "STEP_PAID_FEE")
    private BigDecimal stepPaidFee;

    @JSONField(name = "STEP_TRADE_STATUS")
    private String stepTradeStatus;

    @JSONField(name = "NUT_FEATURE")
    private String nutFeature;

    @JSONField(name = "CREDIT_CARD_FEE")
    private BigDecimal creditCardFee;

    @JSONField(name = "BUYER_MESSAGE")
    private String buyerMessage;

    @JSONField(name = "YFX_ID")
    private String yfxId;

    @JSONField(name = "COD_STATUS")
    private String codStatus;

    @JSONField(name = "TRADE_FROM")
    private String tradeFrom;

    @JSONField(name = "COD_FEE")
    private BigDecimal codFee;

    @JSONField(name = "ADJUST_FEE")
    private BigDecimal adjustFee;

    @JSONField(name = "SEND_TIME")
    private Date sendTime;

    @JSONField(name = "MARK_DESC")
    private String markDesc;

    @JSONField(name = "POST_FEE")
    private BigDecimal postFee;

    @JSONField(name = "PAYMENT")
    private BigDecimal payment;

    @JSONField(name = "PIC_PATH")
    private String picPath;

    @JSONField(name = "SELLER_NICK")
    private String sellerNick;

    @JSONField(name = "TRADE_SOURCE")
    private String tradeSource;

    @JSONField(name = "COMMISSION_FEE")
    private BigDecimal commissionFee;

    @JSONField(name = "RECEIVER_ZIP")
    private String receiverZip;

    @JSONField(name = "RECEIVER_ADDRESS")
    private String receiverAddress;

    @JSONField(name = "RECEIVER_DISTRICT")
    private String receiverDistrict;

    @JSONField(name = "RECEIVER_CITY")
    private String receiverCity;

    @JSONField(name = "RECEIVER_STATE")
    private String receiverState;

    @JSONField(name = "RECEIVER_NAME")
    private String receiverName;

    @JSONField(name = "SELLER_MEMO")
    private String sellerMemo;

    @JSONField(name = "INVOICE_NAME")
    private String invoiceName;

    @JSONField(name = "RECEIVED_PAYMENT")
    private BigDecimal receivedPayment;

    @JSONField(name = "RECEIVER_PHONE")
    private String receiverPhone;

    @JSONField(name = "RECEIVER_MOBILE")
    private String receiverMobile;

    @JSONField(name = "TOTAL_FEE")
    private BigDecimal totalFee;

    @JSONField(name = "DISCOUNT_FEE")
    private BigDecimal discountFee;

    @JSONField(name = "PRICE")
    private BigDecimal price;

    @JSONField(name = "TYPE")
    private String type;

    @JSONField(name = "TITLE")
    private String title;

    @JSONField(name = "STATUS")
    private String status;

    @JSONField(name = "NUM_IID")
    private String numIid;

    @JSONField(name = "TID")
    private String tid;

    @JSONField(name = "TRANSDATE")
    private Date transdate;

    @JSONField(name = "SELLER_RATE")
    private String sellerRate;

    @JSONField(name = "SELLER_CAN_RATE")
    private String sellerCanRate;

    @JSONField(name = "BUYER_RATE")
    private String buyerRate;

    @JSONField(name = "HAS_YFX")
    private String hasYfx;

    @JSONField(name = "IS_FORCE_WLB")
    private Integer isForceWlb;

    @JSONField(name = "IS_BRAND_SALE")
    private Integer isBrandSale;

    @JSONField(name = "IS_LGTYPE")
    private Integer isLgtype;

    @JSONField(name = "ALIPAY_ID")
    private String alipayId;

    @JSONField(name = "INSERTDATE")
    private Date insertdate;

    @JSONField(name = "END_TIME")
    private Date endTime;

    @JSONField(name = "MODIFIED")
    private Date modified;

    @JSONField(name = "PAY_TIME")
    private Date payTime;

    @JSONField(name = "CREATED")
    private Date created;

    @JSONField(name = "CP_C_SHOP_ID")
    private Long cpCShopId;

    @JSONField(name = "CP_C_SHOP_ECODE")
    private String cpCShopEcode;

    @JSONField(name = "ISTRANS")
    private Integer istrans;

    @JSONField(name = "SYSREMARK")
    private String sysremark;

    @JSONField(name = "TRANS_COUNT")
    private Long transCount;

    @JSONField(name = "REAL_POINT_FEE")
    private Long realPointFee;

    @JSONField(name = "BUYER_OBTAIN_POINT_FEE")
    private Long buyerObtainPointFee;

    @JSONField(name = "YFX_TYPE")
    private String yfxType;

    @JSONField(name = "SELLER_FLAG")
    private String sellerFlag;

    @JSONField(name = "POINT_FEE")
    private Long pointFee;

    @JSONField(name = "NUM")
    private Long num;

    @JSONField(name = "MARKDESC")
    private Date markdesc;

    @JSONField(name = "SERVICE_TAG")
    private String serviceTag;

    @JSONField(name = "SERVICE_TYPE")
    private String serviceType;

    @JSONField(name = "OMNICHANNEL_PARAM")
    private String omnichannelParam;

    @JSONField(name = "ORDERTYPE")
    private String ordertype;

    @JSONField(name = "TARGETCODE")
    private String targetcode;

    @JSONField(name = "TARGETNAME")
    private String targetname;

    @JSONField(name = "EST_CON_TIME")
    private Date estConTime;

    @JSONField(name = "CNSERVICE")
    private Integer cnservice;

    @JSONField(name = "OSDATE")
    private Date osdate;

    @JSONField(name = "OSRANGE")
    private Date osrange;

    @JSONField(name = "ESDATE")
    private Date esdate;

    @JSONField(name = "ESRANGE")
    private Date esrange;

    @JSONField(name = "PUSHTIME")
    private Date pushtime;

    @JSONField(name = "ERPHOLD")
    private String erphold;

    @JSONField(name = "TMALLDELIVERY")
    private String tmalldelivery;

    @JSONField(name = "THREEPLTIMING")
    private String threepltiming;

    @JSONField(name = "CUTOFFMINUTES")
    private String cutoffminutes;

    @JSONField(name = "ESTIME")
    private Integer estime;

    @JSONField(name = "DELIVERYTIME")
    private String deliverytime;

    @JSONField(name = "COLLECTTIME")
    private Date collecttime;

    @JSONField(name = "SENDTIME")
    private Date sendtime;

    @JSONField(name = "SIGNTIME")
    private Date signtime;

    @JSONField(name = "DELIVERYCPS")
    private String deliverycps;

    @JSONField(name = "STORECODE")
    private String storecode;

    @JSONField(name = "GATHERLASTCENTER")
    private String gatherlastcenter;

    @JSONField(name = "GATHERSTATION")
    private String gatherstation;

    @JSONField(name = "BIZ_CODE")
    private String bizCode;

    @JSONField(name = "CLOUD_STORE")
    private String cloudStore;

    @JSONField(name = "O2O_SHOPID")
    private String o2oShopid;

    @JSONField(name = "O2O_SHOP_NAME")
    private String o2oShopName;

    @JSONField(name = "ORDERTAKING")
    private Long ordertaking;

    @JSONField(name = "PLATFORM_FLAG")
    private String platformFlag;

    @JSONField(name = "OWNERID")
    private Long ownerid;

    @JSONField(name = "OWNERENAME")
    private String ownerename;

    @JSONField(name = "OWNERNAME")
    private String ownername;

    @JSONField(name = "CREATIONDATE")
    private Date creationdate;

    @JSONField(name = "MODIFIERID")
    private Long modifierid;

    @JSONField(name = "MODIFIERENAME")
    private String modifierename;

    @JSONField(name = "MODIFIERNAME")
    private String modifiername;

    @JSONField(name = "MODIFIEDDATE")
    private Date modifieddate;

    @JSONField(name = "ISACTIVE")
    private String isactive;

    @JSONField(name = "BUYER_ALIPAY_NO")
    private String buyerAlipayNo;

    @JSONField(name = "RESERVE_BIGINT01")
    private Long reserveBigint01;

    @JSONField(name = "RESERVE_BIGINT02")
    private Long reserveBigint02;

    @JSONField(name = "RESERVE_BIGINT03")
    private Long reserveBigint03;

    @JSONField(name = "RESERVE_BIGINT04")
    private Long reserveBigint04;

    @JSONField(name = "RESERVE_BIGINT05")
    private Long reserveBigint05;

    @JSONField(name = "RESERVE_BIGINT06")
    private Long reserveBigint06;

    @JSONField(name = "RESERVE_BIGINT07")
    private Long reserveBigint07;

    @JSONField(name = "RESERVE_BIGINT08")
    private Long reserveBigint08;

    @JSONField(name = "RESERVE_BIGINT09")
    private Long reserveBigint09;

    @JSONField(name = "RESERVE_BIGINT10")
    private Long reserveBigint10;

    @JSONField(name = "RESERVE_DECIMAL01")
    private BigDecimal reserveDecimal01;

    @JSONField(name = "RESERVE_DECIMAL02")
    private BigDecimal reserveDecimal02;

    @JSONField(name = "RESERVE_DECIMAL03")
    private BigDecimal reserveDecimal03;

    @JSONField(name = "RESERVE_DECIMAL04")
    private BigDecimal reserveDecimal04;

    @JSONField(name = "RESERVE_DECIMAL05")
    private BigDecimal reserveDecimal05;

    @JSONField(name = "RESERVE_DECIMAL06")
    private BigDecimal reserveDecimal06;

    @JSONField(name = "RESERVE_DECIMAL07")
    private BigDecimal reserveDecimal07;

    @JSONField(name = "RESERVE_DECIMAL08")
    private BigDecimal reserveDecimal08;

    @JSONField(name = "RESERVE_DECIMAL09")
    private BigDecimal reserveDecimal09;

    @JSONField(name = "RESERVE_DECIMAL10")
    private BigDecimal reserveDecimal10;

    @JSONField(name = "RESERVE_VARCHAR01")
    private String reserveVarchar01;

    @JSONField(name = "RESERVE_VARCHAR02")
    private String reserveVarchar02;

    @JSONField(name = "RESERVE_VARCHAR03")
    private String reserveVarchar03;

    @JSONField(name = "RESERVE_VARCHAR04")
    private String reserveVarchar04;

    @JSONField(name = "RESERVE_VARCHAR05")
    private String reserveVarchar05;

    @JSONField(name = "RESERVE_VARCHAR06")
    private String reserveVarchar06;

    @JSONField(name = "RESERVE_VARCHAR07")
    private String reserveVarchar07;

    @JSONField(name = "RESERVE_VARCHAR08")
    private String reserveVarchar08;

    @JSONField(name = "RESERVE_VARCHAR09")
    private String reserveVarchar09;

    @JSONField(name = "RESERVE_VARCHAR10")
    private String reserveVarchar10;

    @JSONField(name = "ABNORMAL_TYPE")
    private String abnormalType;

    @JSONField(name = "PRESALE_DEPOSIT_TIME")
    private Date presaleDepositTime;
}