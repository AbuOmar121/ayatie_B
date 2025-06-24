package com.ayatie.ayat.controller;

import com.ayatie.ayat.model.Cluster;
import com.ayatie.ayat.service.ClustersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clusters")
@CrossOrigin
public class ClustersController {

    @Autowired
    private ClustersService clustersService;

    @GetMapping
    public List<Cluster> getAllClusters() {
        return clustersService.getClusters();
    }

    @PostMapping
    public Cluster addCluster(@RequestBody Cluster cluster) {
        return clustersService.addCluster(cluster);
    }

    @PutMapping("/{id}")
    public Cluster updateCluster(@PathVariable String id, @RequestBody Cluster cluster) {
        return clustersService.updateCluster(id, cluster);
    }

    @DeleteMapping("/{id}")
    public void deleteCluster(@PathVariable String id) {
        clustersService.deleteCluster(id);
    }
}
