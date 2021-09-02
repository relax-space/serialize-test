# serialize-test

fastjson序列化性能测试

## 测试目的
因为公司使用rocket mq的地方很多，又因为公司封装的发送消息的框架，即使参数是byte[]，也会序列化一次：ObjectUtil.objectSerialize，所以针对目前项目中使用的所有序列化方式做了一个对比测试

## 测试方法

junit5 并行测试，分别在linux 和 windows上环境上测试

## 测试结果

+ 序列化对象：fastjson比java stream序列化快，推荐 使用testObj3的代码，原因：1.速度比java stream快，2.对象比JSONObject更容易取值
+ 序列化集合：java stream序列化比fastjson快，推荐 使用testList7的代码，原因：速度比JSONArray要快3倍

JSONObject测试

|  | 100万 windows | 100万 linux |  代码片段 |
| ---- | ---- |  ---- | ---- |
| testObj1 | 75 | 64 |byte[] b1=JSONObject.toJSONBytes(ipBTaobaoOrder);<br>IpBTaobaoOrder b2=JSONObject.parseObject(b1,IpBTaobaoOrder.class);|
| testObj2 | 90 | 46 |byte[] b1=ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));<br>JSONObject b2=JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString()); |
| testObj3 | 108 | 87 | byte[] b1=ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));<br>IpBTaobaoOrder b2=JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString(),IpBTaobaoOrder.class);|
| testObj4 | 108 | 85 |byte[] b1=ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrder));<br>JSONObject bb=JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString());<br>IpBTaobaoOrder b2=JSONObject.toJavaObject(bb,IpBTaobaoOrder.class); |
| testObj5 | 193 | 215 | JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(ipBTaobaoOrder), Feature.OrderedField);<br>byte[] b1=ObjectUtil.objectSerialize(jsonObject);<br>JSONObject bb = JSON.parseObject(ObjectUtil.objectDeserialize(b1).toString());<br>IpBTaobaoOrder b2=JSONObject.toJavaObject(bb,IpBTaobaoOrder.class);|
| testObj6 | 185 | 210 |JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(ipBTaobaoOrder), Feature.OrderedField);<br>byte[] b1=ObjectUtil.objectSerialize(jsonObject);<br>IpBTaobaoOrder b2=JSONObject.parseObject(ObjectUtil.objectDeserialize(b1).toString(),IpBTaobaoOrder.class); |
| testObj7 | 169 | 137 | byte[] b1=ObjectUtil.objectSerialize(ipBTaobaoOrder);<br>IpBTaobaoOrder b2=(IpBTaobaoOrder)ObjectUtil.objectDeserialize(b1);|

JSONArray测试

|  | 100万 windows | 100万 linux |代码片段 |
| ---- | ---- |  ---- |---- |
| testList1 | 68 | 68 |byte[] b1 = JSONObject.toJSONBytes(ipBTaobaoOrderList);<br>JSONArray bb = (JSONArray) JSONObject.parse(b1);<br>List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class);|
| testList2 | 76 | 76 |byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));<br>JSONArray b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString());|
| testList3 | 91 | 93 |byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));<br>List<IpBTaobaoOrder> b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);|
| testList4 | 73 | 91 |byte[] b1 = ObjectUtil.objectSerialize(JSONObject.toJSONString(ipBTaobaoOrderList));<br>JSONArray bb = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString());<br>List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class)|
| testList5 | 108 | 155 |JSONArray jsonArray = JSONObject.parseArray(JSON.toJSONString(ipBTaobaoOrderList));<br>byte[] b1 = ObjectUtil.objectSerialize(jsonArray);<br>JSONArray bb = JSON.parseArray(ObjectUtil.objectDeserialize(b1).toString());<br>List<IpBTaobaoOrder> b2 = bb.toJavaList(IpBTaobaoOrder.class)|
| testList6 | 150 | 177 |JSONArray jsonArray = JSONObject.parseArray(JSON.toJSONString(ipBTaobaoOrderList));<br>byte[] b1 = ObjectUtil.objectSerialize(jsonArray);<br>List<IpBTaobaoOrder> b2 = JSONObject.parseArray(ObjectUtil.objectDeserialize(b1).toString(), IpBTaobaoOrder.class);|
| testList7 | 17 | 15 |byte[] b1 = ObjectUtil.objectSerialize(ipBTaobaoOrderList);<br>List<IpBTaobaoOrder> b2 = (List<IpBTaobaoOrder>) ObjectUtil.objectDeserialize(b1); |

windows信息：硬件信息如下：

- Operating System: Windows 10 企业版 64-bit (10.0, Build 18362) (18362.19h1_release.190318-1202)
- System Model: Latitude E5570
- Processor: Intel(R) Core(TM) i5-6300U CPU @ 2.40GHz (4 CPUs), ~2.5GHz
- Memory: 32768MB RAM

linux信息：在内存8G的ubuntu上运行的  
- LSB Version:    core-11.1.0ubuntu2-noarch:security-11.1.0ubuntu2-noarch
- Distributor ID: Ubuntu
- Description:    Ubuntu 20.04.1 LTS
- Release:        20.04
- Codename:       focal

## 测试开始

+ 配置maven settings，路径：setting/settings.xml
+ mvn clean test 或者 mvn -Dtest=ObjectTest test 或者 mvn -Dtest=ObjectTest#testObj1 test

## 参考

https://www.swtestacademy.com/junit5-parallel-test-execution/

https://www.baeldung.com/java-measure-elapsed-time

https://www.cjluo.top/2019/02/02/%E5%87%A0%E7%A7%8D%E5%BA%8F%E5%88%97%E5%8C%96%E5%B7%A5%E5%85%B7%E7%9A%84%E6%A8%AA%E5%90%91%E6%AF%94%E8%BE%83/