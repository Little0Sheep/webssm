package com.apg.study;

import com.ibm.wsdl.util.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created by apg on 2017/3/9.
 */
public class StringFs {

    public String toString(Object object){
        Class<?> clazz=object.getClass();
        StringBuilder sb=new StringBuilder();
        Package packageName=clazz.getPackage();
        sb.append("包名:"+packageName.getName()+"\t");
        String className=clazz.getSimpleName();
        sb.append("类名："+className+"\t");
        sb.append("公共构造方法:\n");
        Constructor<?>[] constructors=clazz.getConstructors();
        for(Constructor<?> constructor:constructors){
            String modifier= Modifier.toString(constructor.getModifiers());
            if(modifier.contains("public")){
                sb.append(constructor.toGenericString()+"\n");
            }
        }
        sb.append("公共域:\n");
        Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){
            String modifier=Modifier.toString(field.getModifiers());
            if(modifier.contains("public")){
                sb.append(field.toGenericString()+"\n");
            }
        }
        sb.append("公共方法:\n");
        Method[] methods=clazz.getMethods();
        for(Method method:methods){
            String modifier=Modifier.toString(method.getModifiers());
            if(modifier.contains("public")){
                sb.append(method.toGenericString()+"\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(new StringFs().toString(new Date()));
    }

}
