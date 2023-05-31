## Building

Use Java 17 -Coretto
Gradle 7.6.1

./gradlew clean build

Jar is created in build/libs, with the "-aws" suffix"
Upload to S3 and provide that URi to Lambda
Specify the Lambda runtime - Java 17
Handler - org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest