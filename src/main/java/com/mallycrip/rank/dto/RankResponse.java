package com.mallycrip.rank.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class RankResponse {
    List<UserResponse> rank;
}
