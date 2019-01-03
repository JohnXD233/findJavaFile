package com.hwq.demo;

import java.io.File;

public class Exam {

    public static int javaCount=0;
    public static int xmlCount=0;
    public static void main(String[] args){
        /**
         * 统计jdk下面的 .java .xml 文件个数
         */
        File file=new File("C:\\Program Files\\Java\\jdk1.8.0_112");
        countJava(file);
        System.out.println(".java sum:"+javaCount+"  .xml sum:"+xmlCount);
    }

    public static void countJava(File file){
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(int i=0;i<files.length;i++){
                countJava(files[i]);
            }
        }
        else if(file.isFile()){
            if(file.getName().contains(".xml"))
                xmlCount++;
            else if(file.getName().contains(".java"))
                javaCount++;
                //System.out.println(file.getName());
        }
    }


}
