package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/12.
 * 字母异位词分组
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            char[] s1=strs[i].toCharArray();
            //排序
            Arrays.sort(s1);
            //映射到对应类中
            String key= String.valueOf(s1);
            //包含就添加进去
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }

}
