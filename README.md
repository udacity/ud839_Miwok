# Deprecated Repository
The associated Nanodegree program **Android Basics Nanodegree by Google** ND803 is deprecated now; therefore, this repository is also deprecated. 
# Archival Note
We are archiving this repository because we do not want learners to push personal development to the current repository. If you have any issues or suggestions to make, feel free to:
- Utilize the https://knowledge.udacity.com/ forum to seek help on content-specific issues.
- Submit a support ticket along with the link to your forked repository if (learners are) blocked for other reasons. Here are the links for the [retail consumers](https://udacity.zendesk.com/hc/en-us/requests/new) and [enterprise learners](https://udacityenterprise.zendesk.com/hc/en-us/requests/new?ticket_form_id=360000279131). 


Miwok App
===================================

This app displays lists of vocabulary words for the user to learn the Miwok language.
Used in a Udacity course in the Beginning Android Nanodegree.


How to use this repository
--------------
- Fork this repository to your Github account.
- Open Android Studio 3.2.x+ in your local machine.
- We recommend you to use the [Version Control System](https://developer.android.com/studio/intro#version_control_basics)(VCS) in your Android Studio 3.2.x+ IDE to clone the repository directly in your IDE.
- You may have to use the File > Settings > Version Control (VCS) menu option to set up Git settings.
- Refer to this [IntelliJ document](https://www.jetbrains.com/help/idea/version-control-integration.html) for details.
- Working with VCS will make it easy for you to push your updates or switch between branches to your remote repository in Github.

Prerequisites
--------------

- Android Studio 3.2.1 or higher
- compileSdkVersion 32 (For AndroidX dependencies, the min compileSdkVersion version is 31)
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
~/app/build.graddle(: app) file
~/gradle/wrapper/gradle-wrapper.properties file
You can refer anytime to the latest [Android Gradle plugin release notes](https://developer.android.com/studio/releases/gradle-plugin) for the newest version of plugins.


This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Troubleshoot
---------------
- Gradle version and Android Gradle Plugin version should be compatible. See the table [here](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
- Sometimes, if you face unexpected behavior, go to File > Invalidate Caches/Restart. 
- Android Studio - [How to Change Android SDK Path?](https://stackoverflow.com/questions/16581752/android-studio-how-to-change-android-sdk-path/18409923#18409923)  
- In case you face some unexpected errors with the Emulator, it will be beneficial to wipe out the AVD data by going to Tools >> Device Manager >> Select Device >> Wipe out option.


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
