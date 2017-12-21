/*
 * Copyright (c) 2015 PocketHub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pockethub.android.ui.user;

import com.meisolsson.githubsdk.core.ServiceGenerator;
import com.meisolsson.githubsdk.model.Page;
import com.meisolsson.githubsdk.model.User;
import com.github.pockethub.android.core.PageIterator;
import com.github.pockethub.android.core.ResourcePager;
import com.github.pockethub.android.core.user.UserPager;
import com.meisolsson.githubsdk.service.users.UserFollowerService;

import io.reactivex.Single;
import retrofit2.Response;

/**
 * Fragment to display a list of followers
 */
public class MyFollowersFragment extends FollowersFragment {

    UserFollowerService service = ServiceGenerator.createService(getContext(), UserFollowerService.class);

    @Override
    protected Single<Response<Page<User>>> loadData(int page) {
        return service.getFollowers(page);
    }
}
