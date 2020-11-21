package com.lee.domain.baseDomain;
/**
 *
 * <strong>Description : 返回信息</strong><br>
 * <strong>Create on : 2020/11/15 20:05<br>
 * </strong>
 * <p>
 * 
 * @author LiXuyang <br>
 * @email arnoldlee9527@163.com<br>
 * @version <strong> </strong><br>
 *          <br>
 *          <strong>修改历史:</strong><br>
 *          修改人 | 修改日期 | 修改描述<br>
 *          -------------------------------------------<br>
 *          <br>
 *          <br>
 */ 
public class ReturnMsgDomain {

    /**
     * 返回状态
     */
    private Integer returnStatus;

    /**
     * 返回状态码
     */
    private Integer returnCode;

    /**
     * 返回信息
     */
    private String returnMsg;

    public Integer getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
