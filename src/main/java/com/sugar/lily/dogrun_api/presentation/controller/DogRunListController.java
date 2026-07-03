package com.sugar.lily.dogrun_api.presentation.controller;

import com.sugar.lily.dogrun_api.presentation.response.DogRunResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dogRun")
public class DogRunListController {

    @GetMapping
    public ResponseEntity<List<DogRunResponse>> getAllDogRunsForMap() {
        List<DogRunResponse> mockRuns = List.of(
                new DogRunResponse(1L, "代々木公園 ドッグラン", 35.6715, 139.6966, 5),
                new DogRunResponse(2L, "駒沢オリンピック公園 ドッグラン", 35.6264, 139.6622, 2)
        );
        return ResponseEntity.ok(mockRuns);
    }


}
