package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/13.
 * 简化路径
 */
public class Solution71 {
    public static void main(String[] args) {
        Solution71 solution71=new Solution71();
        String path="/../";
        System.out.println(solution71.simplifyPath(path));
    }
    public String simplifyPath(String path) {
       //利用/分割单词
        String[] s1=path.split("/");
        //将空字符串和.去掉，保存起来。
        List<String> wordList=new ArrayList<>();
        for (int i = 0; i <s1.length ; i++) {
            if((!s1[i].isEmpty())&&(!s1[i].equals("."))){
                wordList.add(s1[i]);
            }
        }
        //保存简化之后的路径
        List<String> wordListSim=new ArrayList<>();
        for (int i = 0; i <wordList.size() ; i++) {
            //遇到..就删除末尾单词
            if(wordList.get(i).equals("..")){
                if(!wordListSim.isEmpty()){
                    wordListSim.remove(wordListSim.size()-1);
                }
            }else {
                wordListSim.add(wordList.get(i));
            }
        }
        String ans= String.join("/",wordListSim);
        ans="/"+ans;
        return ans;
    }
}
