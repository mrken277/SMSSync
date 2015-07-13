/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.data.twitter;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Builds the Twitter service
 *
 * @author Henry Addo
 */
public class TwitterBuilder {

    private String mConsumerKey;

    private String mConsumerSecret;

    private Context mContext;

    public TwitterBuilder consumerKey(@NonNull String consumerKey) {
        mConsumerKey = consumerKey;
        return this;
    }

    public TwitterBuilder consumerSecret(@NonNull String consumerSecret) {
        mConsumerSecret = consumerSecret;
        return this;
    }

    public TwitterBuilder context(Context context) {
        mContext = context;
        return this;
    }

    public Twitter build() {
        return new Twitter(mContext, new TwitterAuthConfig(mConsumerKey, mConsumerSecret));
    }
}
