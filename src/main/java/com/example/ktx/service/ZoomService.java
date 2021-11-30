package com.example.ktx.service;

import com.example.ktx.entity.Zoom;

import java.util.List;
import java.util.Optional;

public interface ZoomService {
    List<Zoom> getAllZoom();

    void saveZoom(Zoom zoom);

    void deleteZoom(Long id);

    Optional<Zoom> findZoomById(Long id);
}
