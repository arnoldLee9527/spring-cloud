package com.lee.domain.baseDomain;
/**
 *
 * <strong>Description : 返回对象</strong><br>
 * <strong>Create on : 2020/11/15 20:03<br>
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
public class ReturnDomain<T>  extends ReturnMsgDomain{

    /**
     * 返回数据
     */
    private T returnDomain;

    public T getReturnDomain() {
        return returnDomain;
    }

    public void setReturnDomain(T returnDomain) {
        this.returnDomain = returnDomain;
    }
}
