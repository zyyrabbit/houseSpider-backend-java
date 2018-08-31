package com.zyy.house.spider.common;
/**
* 常量类
 */
public class Constant {
    public enum RESULT {
        /**
         * 成功
         */
        CODE_YES("0"),
        /**
         * 失败
         */
        CODE_NO("-1"),
        /**
         * 失败msg
         */
        MSG_YES("请求成功"),
        /**
         * 失败msg
         */
        MSG_NO("请求失败");
        private String value;

        private RESULT(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }
}
