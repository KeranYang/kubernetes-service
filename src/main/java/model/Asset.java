package main.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {
    private String assetId;
    private String namespaceName;
    private String clusterName;

    public Asset(String assetId, String namespaceName, String clusterName) {
        this.assetId = assetId;
        this.namespaceName = namespaceName;
        this.clusterName = clusterName;
    }

    @JsonProperty
    public String getAssetId() {
        return assetId;
    }

    @JsonProperty
    public String getNamespaceName() {
        return namespaceName;
    }

    @JsonProperty
    public String getClusterName() {
        return clusterName;
    }
}
