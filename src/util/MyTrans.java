package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * 价格需要根据不同版本调整,版本信息中包含了配置参数和颜色
 * 以上信息需要转换为字符串存储在数据库中，本类提供了一系列方法进行转换
 *
 * 版本信息为二维数组，如version[0]中存储了一个长度为2的一维数组，第一个元素为配置，第二个元素为颜色
 * 价格为一维数组，长度与版本信息的二维数组相同
 */
public class MyTrans {
    public String arrayToStringPrice(String[] array){
        StringBuilder sb=new StringBuilder();
        for (String value:array){
            sb.append(value.trim()).append(",");
        }
        return sb.toString();
    }

    public String[] stringToArrayPrice(String string){
        return string.split(",");
    }

    public String arrayToStringVersion(String[][] array){
        Gson gson=new Gson();
        return gson.toJson(array);
    }

    public String[][] stringToArrayVersion(String string){
        Gson gson=new Gson();
        return gson.fromJson(string,new TypeToken<String[][]>(){}.getType());
    }
}
