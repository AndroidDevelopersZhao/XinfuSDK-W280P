package cn.com.shanghai.xinfusdk_w280p.useunxor.listener;

/**
 * Created by Administrator on 2016/5/19.
 */
public interface OnUnConsumeListener {
    void onSucc();

    void onGetCard();

    void onPswInPutDown();

    void onError(String errorMsg);
}
