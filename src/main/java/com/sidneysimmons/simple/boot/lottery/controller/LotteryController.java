package com.sidneysimmons.simple.boot.lottery.controller;

import com.sidneysimmons.simple.boot.lottery.domain.LotteryNumbersResponse;
import com.sidneysimmons.simple.boot.lottery.service.LotteryService;
import java.time.ZonedDateTime;
import javax.annotation.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Lottery controller for lottery related endpoints.
 * 
 * @author Sidney Simmons
 */
@RestController
@RequestMapping(value = "/lottery", produces = MediaType.APPLICATION_JSON_VALUE)
public class LotteryController {

	@Resource(name = "lotteryService")
	private LotteryService lotteryService;

	/**
	 * Build and return a new set of lottery numbers.
	 * 
	 * @return the newly created lottery numbers
	 */
	@GetMapping(value = "/create-numbers")
	public LotteryNumbersResponse createNumbers() {
		LotteryNumbersResponse response = new LotteryNumbersResponse();
		response.setLotteryNumbers(lotteryService.createNumbers());
		response.setCreationTime(ZonedDateTime.now());
		return response;
	}

}
