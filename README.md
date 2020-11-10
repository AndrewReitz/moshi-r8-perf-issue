# Show casing issue with R8 and Moshi Generated Proguard Files

The issue we are seeing is when there are enough proguard files R8 will time out.

```
> Task :app:minifyReleaseWithR8
R8: Library class android.content.res.XmlResourceParser implements program class org.xmlpull.v1.XmlPullParser
Too long with no output (exceeded 10m0s): context deadline exceeded
```

Repo does not reproduce this issue but a significant performance hit can be seen when using more proguard files.
R8 only takes 6 seconds with Moshi 1.9.3 where as it's taking more than a minute when using 1.11.0.

3k files
1.11.0 Build Scan https://scans.gradle.com/s/b2a44tzqfbtrg/performance/execution
1.9.3 Build Scan https://scans.gradle.com/s/e62blaxbkt5j2/performance/execution

10k files
1.11.0 Build Scan https://scans.gradle.com/s/3v3kxnwz6wp7c/performance/execution
1.9.3 Build Scan https://scans.gradle.com/s/fxq27ota2pdpo/performance/execution

R8 Ticket: https://issuetracker.google.com/issues/172999904
