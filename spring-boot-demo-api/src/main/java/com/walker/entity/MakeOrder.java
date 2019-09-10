package com.walker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 全参数构造函数
 */
@AllArgsConstructor
/**
 *非参数构造函数
 */
@NoArgsConstructor
/**
 *set_get_方法 equals、canEqual、hashCode、toString方法
 */
@Data
public class MakeOrder implements Serializable {
    /**
     * make_order.id
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String id;

    /**
     * make_order.order_code (订单号)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String orderCode;

    /**
     * make_order.user_id (用户id)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String userId;

    /**
     * make_order.warehouse_id (仓库id)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String warehouseId;

    /**
     * make_order.make_time (预约日期)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Date makeTime;

    /**
     * make_order.status (预约状态 0：待支付撤销 1 ：待支付 2： 正常（已支付）3：退预定金 4：取消退款)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Byte status;

    /**
     * make_order.create_time (创建时间)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Date createTime;

    /**
     * make_order.make_code (预约码)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String makeCode;

    /**
     * make_order.make_num (预约总数量)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Byte makeNum;

    /**
     * make_order.make_money (预约总金额（单位：分）)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private BigDecimal makeMoney;

    /**
     * make_order.reason (取消原因)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String reason;

    /**
     * make_order.order_id (ping++ order对象id)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String orderId;

    /**
     * make_order.charge_id (ping++ charge对象id)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String chargeId;

    /**
     * make_order.channel (支付渠道：0无支付，1支付宝App支付，2支付宝扫码支付，3微信App支付，4微信公众号支付，5微信扫码支付，6余额支付，7智荟金桥，8微信小程序支付，9支付宝条码支付，10微信付款码支付，11银行卡支付，12现金支付)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Byte channel;

    /**
     * make_order.pay_code (支付商户号)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String payCode;

    /**
     * make_order.pay_date (支付时间)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Date payDate;

    /**
     * make_order.cancel_date (取消时间)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Date cancelDate;

    /**
     * make_order.refund_date (退款时间)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private Date refundDate;

    /**
     * make_order.refund_id (ping++ refund对象id)
     * @author: lying
     * @time: 2019-09-06 11:23:16
     */
    private String refundId;

    private String dbSource;

}