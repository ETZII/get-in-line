package com.etzii.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {
    private Long id;
    private Long PlaceId;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
