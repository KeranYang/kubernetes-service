To use it: run `mvn clean install` and `mvn spring-boot:run`. Open another terminal and run `curl -H "Accept: application/json" http://localhost:7373/getResources/1`, it should give `{"assetId":"1","namespaceName":"namespace1","clusterName":"cluster1"}`
