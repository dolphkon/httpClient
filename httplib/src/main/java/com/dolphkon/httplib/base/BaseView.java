package com.dolphkon.httplib.base;

/**
 * ****************************************************
 * Project: WanandroidClient
 * PackageName: com.dolphkon.httplib
 * ClassName：
 * Author: kongdexi
 * Date: 2020/10/12 15:08
 * Description:TODO
 * *****************************************************
 */
public interface BaseView {

    void showToast(String msg);

    void showToast(int msgId);

    void showLoading();

    void showLoading(String msg);

    void showLoading(int msgId);

    void hideLoading();
}
