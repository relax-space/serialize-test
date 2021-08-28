# serialize-test

fastjson序列化性能测试

## 测试结果

+ 序列化对象：fastjson比java stream序列化快，推荐 使用testObj3的代码，原因：1.速度比java stream快，2.对象比JSONObject更容易取值
+ 序列化集合：java stream序列化比fastjson快，推荐 使用testList7的代码，原因：速度比JSONArray要快3倍

JSONObject测试

|  | 100万 第1次 | 100万 第2次 | 100万 第3次 |
| ---- | ---- |  ---- | ---- | 
| testObj1 | 75 | 70 | 83 |
| testObj2 | 90 | 79 | 106 |
| testObj3 | 108 | 98 | 124 |
| testObj4 | 108 | 100 | 112 |
| testObj5 | 193 | 171 | 173 |
| testObj6 | 185 | 162 | 165 |
| testObj7 | 169 | 166 | 177 |

JSONArray测试

|  | 100万 第1次 | 100万 第2次 | 100万 第3次 |
| ---- | ---- |  ---- | ---- | 
| testList1 | 68 | 65 | 65 |
| testList2 | 76 | 73 | 77 |
| testList3 | 91 | 90 | 93 |
| testList4 | 73 | 72 | 77 |
| testList5 | 108 | 108 | 106 |
| testList6 | 150 | 148 | 147 |
| testList7 | 17 | 17 | 17 |

硬件信息如下：

- Operating System: Windows 10 企业版 64-bit (10.0, Build 18362) (18362.19h1_release.190318-1202)
- System Model: Latitude E5570
- Processor: Intel(R) Core(TM) i5-6300U CPU @ 2.40GHz (4 CPUs), ~2.5GHz
- Memory: 32768MB RAM

## 测试开始

+ 配置maven settings，路径：setting/settings.xml
+ mvn clean test 或者 mvn -Dtest=ObjectTest test 或者 mvn -Dtest=ObjectTest#testObj1 test

## 参考

https://www.swtestacademy.com/junit5-parallel-test-execution/

https://www.baeldung.com/java-measure-elapsed-time

https://www.cjluo.top/2019/02/02/%E5%87%A0%E7%A7%8D%E5%BA%8F%E5%88%97%E5%8C%96%E5%B7%A5%E5%85%B7%E7%9A%84%E6%A8%AA%E5%90%91%E6%AF%94%E8%BE%83/