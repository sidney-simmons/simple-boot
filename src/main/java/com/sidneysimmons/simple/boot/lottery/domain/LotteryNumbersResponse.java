package com.sidneysimmons.simple.boot.lottery.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sidneysimmons.simple.boot.serializer.ZonedDateTimeSerializer;
import java.time.ZonedDateTime;
import lombok.Data;

@Data
public class LotteryNumbersResponse {

	private LotteryNumbers lotteryNumbers;

	@JsonSerialize(using = ZonedDateTimeSerializer.class)
	private ZonedDateTime creationTime;

}
