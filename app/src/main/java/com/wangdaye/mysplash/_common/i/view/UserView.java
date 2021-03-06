package com.wangdaye.mysplash._common.i.view;

import com.wangdaye.mysplash._common.data.entity.unsplash.User;

/**
 * User view.
 * */

public interface UserView {

    void drawUserInfo(User user);

    void initRefreshStart();
    void requestDetailsSuccess();
    void requestDetailsFailed();

    void followRequestSuccess(boolean follow);
    void followRequestFailed(boolean follow);
}
