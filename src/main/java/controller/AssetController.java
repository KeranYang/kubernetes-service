package main.java.controller;

import main.java.model.Asset;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AssetController {
    private Map<String, Asset> assetMap;

    public AssetController() {
        this.assetMap = new HashMap<>();
        this.assetMap.put("1", new Asset("1","namespace1", "cluster1"));
        this.assetMap.put("2", new Asset("2","namespace1", "cluster1"));
        this.assetMap.put("numaflow-assets-1", new Asset("numaflow-assets-1","default", "odl-test-cluster"));
    }

    @CrossOrigin(origins = "http://localhost:3000") // allow local backstage application to access the APIs.
    @GetMapping(value = "/getResources/{assetId}", produces = "application/json")
    public Asset getResources(@PathVariable String assetId) {
        return assetMap.get(assetId);
    }
}
