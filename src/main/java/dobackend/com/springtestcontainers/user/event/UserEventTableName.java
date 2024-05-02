package dobackend.com.springtestcontainers.user.event;

import io.awspring.cloud.dynamodb.DynamoDbTableNameResolver;

public class UserEventTableName implements DynamoDbTableNameResolver {
    @Override
    public <T> String resolve(Class<T> clazz) {
        return "user_events";
    }
}
