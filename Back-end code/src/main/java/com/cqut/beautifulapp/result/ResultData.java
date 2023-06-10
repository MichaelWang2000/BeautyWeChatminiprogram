package com.cqut.beautifulapp.result;

public class ResultData {
    // 状态码 code
    private Integer code;

    // 信息 msg
    private String msg;

    // 数据 data
    private Object data;

    public ResultData(){

    }
    public ResultData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public ResultData(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public ResultData(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
