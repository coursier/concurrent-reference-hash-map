# concurrent-reference-hash-map

[![Build status](https://github.com/alexarchambault/concurrent-reference-hash-map/workflows/CI/badge.svg)](https://github.com/alexarchambault/concurrent-reference-hash-map/actions?query=workflow%3ACI)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.alexarchambault/concurrent-reference-hash-map.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.alexarchambault/concurrent-reference-hash-map)

`ConcurrentReferenceHashMap` from [hibernate](https://github.com/hibernate/hibernate-orm/blob/1c6e2b4efb571d99037135ec6e242966db1919a9/hibernate-core/src/main/java/org/hibernate/internal/util/collections/ConcurrentReferenceHashMap.java)
re-packaged as a single dependency-free JAR. Released under the same license
as the original hibernate code: LGPL version 2.1.

## Usage

```scala
libraryDependencies += "io.github.alexarchambault" % "concurrent-reference-hash-map" % "1.0.0"
```

The latest version is [![Maven Central](https://img.shields.io/maven-central/v/io.github.alexarchambault/concurrent-reference-hash-map.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.alexarchambault/concurrent-reference-hash-map).

Use it in your code like
```scala
import concurrentrefhashmap.ConcurrentReferenceHashMap
val map = new ConcurrentReferenceHashMap[String, (Int, Int)](
  16,
  ConcurrentReferenceHashMap.ReferenceType.WEAK,
  ConcurrentReferenceHashMap.ReferenceType.WEAK
)
```
