package com.plastik.flickrfeed.application.feign;

import com.plastik.flickrfeed.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feed", url = "${feign.url}", configuration = FeignConfig.class)
public interface FeedFeignClient {
    @GetMapping
    ResponseEntity<String> getFeed(@RequestParam(value = "tags", required = false) String tags);
}
