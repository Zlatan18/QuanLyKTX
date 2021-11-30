package com.example.ktx.service.impl;

import com.example.ktx.entity.Zoom;
import com.example.ktx.responsitory.ZoomRepository;
import com.example.ktx.service.ZoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
@Service
public abstract class ZoomServiceImpl implements ZoomService {
    @Autowired
    private ZoomRepository zoomRepository;

    @Override
    public List<Zoom> getAllZoom() {
        return (List<Zoom>) zoomRepository.findAll();
    }

    @Override
    public void saveZoom(Zoom zoom) {
        zoomRepository.save(zoom);
    }

    @Override
    public void deleteZoom(Long id) {
        zoomRepository.deleteById(id);
    }

    @Override
    public Optional<Zoom> findZoomById(Long id) {
        return zoomRepository.findById(id);
    }
}
