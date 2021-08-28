package com.sample.data;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: 肖新苗
 * @Description:
 * @Date:Create：in 2020/12/6 15:20
 * @Modified By：
 */
public class ListUtil {
    /**
     * 拆分集合：把一个大集合拆分成很多的小集合
     *
     * @param sourceList : 原始集合
     * @param groupSize  : 小集合的长度
     * @return java.util.List<java.util.List < T>>
     * @author 肖新苗
     * @since 2020/7/2
     */
    public static <T> List<List<T>> split(List<T> sourceList, int groupSize) {
        int stepSize = (sourceList.size() + groupSize - 1) / groupSize;
        return Stream.iterate(0, n -> n + 1).limit(stepSize).
                parallel().map(a -> sourceList.stream().skip((long) a * groupSize).limit(groupSize).parallel().collect(Collectors.toList())).collect(Collectors.toList());
    }


}
