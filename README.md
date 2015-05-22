# proguard-annotations

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-proguard--annotations-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1833)
![JitPack](https://img.shields.io/github/tag/yongjhih/proguard-annotations.svg?label=maven)
[![Download](https://api.bintray.com/packages/yongjhih/maven/proguard-annotations/images/download.svg) ](https://bintray.com/yongjhih/maven/proguard-annotations/_latestVersion)
[![javadoc.io](https://javadocio-badges.herokuapp.com/com.infstory/proguard-annotations/badge.svg)](http://www.javadoc.io/doc/com.infstory/proguard-annotations/)
[![Build Status](https://travis-ci.org/yongjhih/proguard-annotations.svg)](https://travis-ci.org/yongjhih/proguard-annotations)
[![Join the chat at https://gitter.im/yongjhih/proguard-annotations](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/yongjhih/proguard-annotations?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![proguard](art/proguard.png)](art/proguard.png)

Easy to use inline `@Keep` annotation to keep class.

And easy to install.

## Usage

```java
@Keep
@KeepClassMembers
public class KeepMe {
    String keepMe;
}
```

## Installation

build.gradle:

```gradle
dependencies {
    compile "com.infstory:proguard-annotations:1.0.2"
}
```

## Annotations

[![javadoc.io](https://javadocio-badges.herokuapp.com/com.infstory/proguard-annotations/badge.svg)](http://www.javadoc.io/doc/com.infstory/proguard-annotations/)

How annotations do? [proguard-annotations/annotations.pro](proguard-annotations/annotations.pro)

## See Also

Import from official [proguard/examples/annotations/src/proguard/annotation](https://github.com/facebook/proguard/tree/master/examples/annotations/src/proguard/annotation)

ref. http://proguard.sourceforge.net/manual/examples.html#annotated

## Test

```
$ /gradelw clean assembleRelease
$ cd proguard-annotations-app/build/outputs/apk
$ unzip proguard-annotations-app-release-unsigned.apk
$ dex2jar classes.dex
$ unzip classes_dex2jar.jar
$ tree proguard
proguard
├── annotation
│   ├── BuildConfig.class
│   ├── KeepApplication.class
│   ├── Keep.class
│   ├── KeepClassMemberNames.class
│   ├── KeepClassMembers.class
│   ├── KeepGettersSetters.class
│   ├── KeepImplementations.class
│   ├── KeepName.class
│   ├── KeepPublicClassMemberNames.class
│   ├── KeepPublicClassMembers.class
│   ├── KeepPublicGettersSetters.class
│   ├── KeepPublicImplementations.class
│   ├── KeepPublicProtectedClassMemberNames.class
│   └── KeepPublicProtectedClassMembers.class
└── app
    ├── KeepMe.class
    └── KeepMeWithoutMembers.class

$ jd-gui classes_dex2jar.jar # Optional
```

```
$ tree proguard-annotations-app/src/main/java
proguard-annotations-app/src/main/java
└── proguard
    └── app
        ├── DontKeepMe.java
        ├── KeepMe.java
        └── KeepMeWithoutMembers.java
```

## TODO

* Test Cases

## [License] (LICENSE)

```
The MIT License (MIT)

Copyright (c) 2014 Andrew Chen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
