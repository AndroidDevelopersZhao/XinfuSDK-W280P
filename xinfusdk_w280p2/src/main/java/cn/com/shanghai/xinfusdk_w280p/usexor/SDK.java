package cn.com.shanghai.xinfusdk_w280p.usexor;

import cn.com.shanghai.xinfusdk_w280p.modle.ConsumeData;
import cn.com.shanghai.xinfusdk_w280p.modle.DeviceInfo;
import cn.com.shanghai.xinfusdk_w280p.modle.GetBalanceData;
import cn.com.shanghai.xinfusdk_w280p.modle.UnConsumeData;
import cn.com.shanghai.xinfusdk_w280p.useunxor.listener.OnConsumeListener;
import cn.com.shanghai.xinfusdk_w280p.useunxor.listener.OnGetBalanceListener;
import cn.com.shanghai.xinfusdk_w280p.useunxor.listener.OnGetDeviceInfoListener;
import cn.com.shanghai.xinfusdk_w280p.useunxor.listener.OnSign;
import cn.com.shanghai.xinfusdk_w280p.useunxor.listener.OnUnConsumeListener;

/**
 * Created by Administrator on 2016/5/19.
 */
public interface SDK {
    /**
     * 获取设备信息
     *
     * @param deviceInfoListener 执行结果回调
     */
    void getDeviceInfo(OnGetDeviceInfoListener deviceInfoListener);

    /**
     * 设备签到，每天至少签到一次
     *
     * @param deviceInfo 设备信息
     * @param sign       执行结果回调
     */
    void doSign(DeviceInfo deviceInfo, OnSign sign);

    /**
     * 消费交易
     *
     * @param consumeData     消费所需参数，详见实体类内部描述
     * @param consumeListener 执行结果回调
     */
    void consume(ConsumeData consumeData, OnConsumeListener consumeListener);

    /**
     * 根据订单号撤销交易
     *
     * @param unConsumeData     撤销交易所需参数
     * @param unConsumeListener 执行结果监听器
     */
    void unConsume(UnConsumeData unConsumeData, OnUnConsumeListener unConsumeListener);


    /**
     * 查询余额
     *
     * @param getBalanceData     查余参数
     * @param getBalanceListener 执行结果监听器
     */
    void getBalance(GetBalanceData getBalanceData, OnGetBalanceListener getBalanceListener);
}
