# traq4j

[ ![Download](https://api.bintray.com/packages/motoki317/traq4j/traq4j/images/download.svg) ](https://bintray.com/motoki317/traq4j/traq4j/_latestVersion)

traQ API client for Java

Requires Java 8+

## Example usage
### pom.xml

Make sure to use the latest version

traq4j [ ![Download](https://api.bintray.com/packages/motoki317/traq4j/traq4j/images/download.svg) ](https://bintray.com/motoki317/traq4j/traq4j/_latestVersion)

```xml
<project>
    <repositories>
        <repository>
            <id>jcenter</id>
            <name>jcenter-bintray</name>
            <url>https://jcenter.bintray.com</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.github.motoki317</groupId>
            <artifactId>traq4j</artifactId>
            <version>3.0.0</version>
        </dependency>
    </dependencies>
</project>
```

### Code

```java
public class Main {
    public static void main(String[] args){
        // Create API client
        String accessToken = System.getenv("ACCESS_TOKEN");
        ApiClient client = new ApiClient();
        client.addDefaultHeader("Authorization", "Bearer " + accessToken);

        // Message API client
        MessageApi messageApi = new MessageApi(client);

        // Post message
        String channelId = "00000000-0000-0000-0000-000000000000";
        String content = "oisu~";
        Message message = messageApi.postMessage(
                UUID.fromString(channelId),
                new PostMessageRequest().content(content).embed(false)
        );
        assert message != null;
    }
}
```
