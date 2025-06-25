package com.ayatie.ayat.service;

import com.ayatie.ayat.model.Cluster;
import com.ayatie.ayat.repository.ClusterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClustersService {

    // @Autowired
    private ClusterRepository clusterRepository;

    public Cluster addCluster(Cluster cluster) {
        return clusterRepository.save(cluster);
    }

    public List<Cluster> getClusters() {
        return clusterRepository.findAll();
    }

    public Optional<Cluster> getClusterById(Integer id) {
        return clusterRepository.findById(id);
    }

    public void deleteCluster(Integer id) {
        clusterRepository.deleteById(id);
    }

    public Cluster updateCluster(int id, Cluster updatedCluster) {
        updatedCluster.setCid(id);
        return clusterRepository.save(updatedCluster);
    }

    public void deleteCluster(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteCluster'");
    }
}
