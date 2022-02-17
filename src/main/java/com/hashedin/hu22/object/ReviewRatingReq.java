package com.hashedin.hu22.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewRatingReq{
    private String name;
    private String review;
    private Double rating;
}
