package com.sugar.lily.dogrun_api.presentation.controller;

import com.sugar.lily.dogrun_api.presentation.response.DogRunResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dogRuns")
@Slf4j
public class DogRunListController {

    private List<DogRunResponse> mockRuns = new ArrayList<>(List.of(
            new DogRunResponse(1L, "代々木公園 ドッグラン", 35.6715, 139.6966, 5),
            new DogRunResponse(2L, "駒沢オリンピック公園 ドッグラン", 35.6264, 139.6622, 2)
    ));

    @GetMapping
    public ResponseEntity<List<DogRunResponse>> getAllDogRunsForMap() {
        return ResponseEntity.ok(mockRuns);
    }

    @PostMapping("/{id}/checkIn")
    public ResponseEntity<DogRunResponse> checkIn(@PathVariable Long id) {
        for (DogRunResponse run : mockRuns) {
            if (run.getId().equals(id)) {
                run.setActiveDogCount(run.getActiveDogCount() + 1);
                return ResponseEntity.ok(run); // 更新後のデータを返す
            }
        }
        return ResponseEntity.notFound().build();
    }


}
