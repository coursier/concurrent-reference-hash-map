# concurrent-reference-hash-map

[![Build status](https://github.com/coursier/concurrent-reference-hash-map/workflows/CI/badge.svg)](https://github.com/coursier/concurrent-reference-hash-map/actions?query=workflow%3ACI)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.alexarchambault/concurrent-reference-hash-map.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.alexarchambault/concurrent-reference-hash-map)

`ConcurrentReferenceHashMap` from [hazelcast](https://github.com/hazelcast/hazelcast/blob/bacfd050453824df221393be89b847beeec50ce0/hazelcast/src/main/java/com/hazelcast/internal/util/ConcurrentReferenceHashMap.java)
re-packaged as a single dependency-free JAR. Released under the same license
as the original hazelcast code: Apache 2.

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
