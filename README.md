## BytePlus SDK for Java

### - Maven依赖
[![maven](https://img.shields.io/maven-central/v/com.byteplus/byteplus-sdk-java)](https://search.maven.org/artifact/com.byteplus/byteplus-sdk-java)
```
<dependency>
    <groupId>com.byteplus</groupId>
    <artifactId>byteplus-sdk-java</artifactId>
    <version>latest</version>
</dependency>
```
### AK/SK Setting
- Explicitly call setAccessKey/setSecretKey method in service class

- Set env variable VOLC_ACCESSKEY="your ak"  VOLC_SECRETKEY = "your sk"

- json config at ～/.volc/config，format：{"ak":"your ak","sk":"your sk"}

Above options will take precedence in sequence, Suggest use option 1 for better trouble shooting

### Region Setting
- Currently, below regions are supported:
  ```
  - ap-singapore-1
  ```


#### More examples:
src/main/java/com/example