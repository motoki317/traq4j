# traq4j

[![GitHub release](https://img.shields.io/github/release/motoki317/traq4j.svg)](https://GitHub.com/motoki317/traq4j/releases/)

traQ API client for Java

Requires Java 8+

## Example usage

### pom.xml

Make sure to use the latest version shown below.

[![GitHub release](https://img.shields.io/github/release/motoki317/traq4j.svg)](https://GitHub.com/motoki317/traq4j/releases/)

```xml
<project>
    <repositories>
        <repository>
            <id>GitHub traq4j</id>
            <url>https://raw.github.com/motoki317/traq4j/mvn-repo/</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.github.motoki317</groupId>
            <artifactId>traq4j</artifactId>
            <version>${traq4j.version}</version>
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

## Development

1. `$ ./generate.sh`
2. Reformat code (takes some time)
