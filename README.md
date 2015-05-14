[![proguard](art/proguard.png)](art/proguard.png)

proguard-annotations
====================

Easy to use inline @Keep annotation to keep class, no need to add `-keep class com.github.yongjhih.gson.Post { *; }` into proguard.flags. By AAR, no need to include `annotation.jar` file and configure `proguardFiles annotation.pro`

Usage
=====

For Gson, No need to add ```-keep class com.github.yongjhih.gson.Post { *; }``` into proguard.flags.

For Jackson, No need to add ```-keep class com.github.yongjhih.jackson.Post { *; }``` into proguard.flags.

For Retrofit, No need to add ```-keep class com.github.yongjhih.retrofit.Post { *; }``` into proguard.flags.

Instead, Inline keep class and members:

```java
@Keep
@KeepClassMembers
public class Post {
    ...
}
```

Installation
============

build.gradle:

```gradle
dependencies {
    compile "com.infstory:proguard-annotations:+"
}
```

See Also
========

Import from official [proguard/examples/annotations/src/proguard/annotation](https://github.com/facebook/proguard/tree/master/examples/annotations/src/proguard/annotation)

ref. http://proguard.sourceforge.net/manual/examples.html#annotated

TODO
====

* Test Cases, sample app

[License] (LICENSE)
===================

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
