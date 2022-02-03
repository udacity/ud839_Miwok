Miwok App
===================================

This app displays lists of vocabulary words for the user to learn the Miwok language.
Used in a Udacity course in the Beginning Android Nanodegree. The video below shows how the app would look like after the end of Lesson five:

https://user-images.githubusercontent.com/48475411/152319658-a3db16e5-077a-4b54-b3c2-e9ecbc51628d.mov


In case you face some unexpected errors at this stage, it will be beneficial to wipe out the AVD data by going to **Tools >> Device Manager >> Select Device >> Wipe out** option, as shown below. 

<img width="290" alt="Screenshot 2022-02-03 at 3 24 46 PM" src="https://user-images.githubusercontent.com/48475411/152320019-384cb7a3-dbca-4410-902b-8efb5865cdd7.png">


Pre-requisites
--------------

- Android Studio 3.2.1 or higher
- compileSdkVersion 31
- targetSdkVersion 31
- minSdkVersion 21
- Supports up to Android 12
- Gradle 7.2.0

To run app in an Android Virtual Device (AVD), we have used the following configuration:
- Pixel 4 Mobile device with x86 System image
- API level 30
- Android 11

Note - Gradle Updates
---------------

The Android Studio build system depends on Gradle and its plugins. The Gradle and its plugins have to be updated separately of Android Studio.
For the updated version, refer to the following updated files:
~/build.gradle (project) file
~/app/build.gradle(: app) file
~/gradle/wrapper/gradle-wrapper.properties file
You can refer anytime to the latest [Android Gradle plugin release notes](https://developer.android.com/studio/releases/gradle-plugin) for the newest version of plugins.



License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
