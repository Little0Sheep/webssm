package com.apg.study;

import java.lang.reflect.Constructor;

/**
 * Created by apg on 2017/3/9.
 */
public class ClassFs {

    public static void main(String[] args){
        User1 user=new User1(0,"sdf","dsf");
        Class<? extends User1> userC=user.getClass();

        Constructor[] declaredConstructors=userC.getDeclaredConstructors();
        for(int i=0;i<declaredConstructors.length;i++){
            Constructor<?> constructor=declaredConstructors[i];
            System.out.println("查看是否允许带有可变数量的参数"+constructor.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为：");
            Class[] parameterTypes=constructor.getParameterTypes();
            for(int j=0;j<parameterTypes.length;j++){
                System.out.println(" "+parameterTypes[j]);
            }
            System.out.println("该构造方法可能抛出的异常类型为：");
            Class[] exceptionTypes=constructor.getExceptionTypes();
            for(int j=0;j<exceptionTypes.length;j++){
                System.out.println(" "+exceptionTypes[j]);
            }

//            User1 user1=null;
//            while(user1==null){
//                try{
//                    if(i==2)
//                        user1=(User1)constructor.newInstance();
//                    else if(i==1)
//                        user1=(User1)constructor.newInstance(0,"sdf","dgd");
//                    else{
//                        Object[] parameters=new Object[]{ new String[] {
//                                "100","200","300"}};
//                        user1=(User1)constructor.newInstance(parameters);
//                    }
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//            }

        }

    }

}
