package com.sugar.lily.dogrun_api.presentation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogRunResponse {
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private long activeDogCount;
}
