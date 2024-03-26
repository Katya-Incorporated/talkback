/*
 * Copyright (C) 2022 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.accessibility.talkback.dynamicfeature;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A downloader stub for TalkBack dynamic features. It always reports successful for download
 * requests.
 */
public class FeatureDownloader {

  private static final String TAG = "FeatureDownloader";

  @Nullable private static FeatureDownloader instance;

  private FeatureDownloader(Context context) {}

  public static FeatureDownloader getInstance(Context context) {
    if (instance == null) {
      instance = new FeatureDownloader(context);
    }
    return instance;
  }

  /**
   * Stub method for updating  install status of all modules.
   */
  public synchronized void updateAllInstallStatuses() {}
}
