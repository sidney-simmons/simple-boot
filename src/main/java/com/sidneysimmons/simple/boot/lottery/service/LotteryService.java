package com.sidneysimmons.simple.boot.lottery.service;

import com.sidneysimmons.simple.boot.lottery.domain.LotteryNumbers;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("lotteryService")
public class LotteryService {

	@Value("${lottery.numbers.upper-limit}")
	private Integer upperLimit;

	public LotteryNumbers createNumbers() {
		// Create a random integer generator
		SecureRandom random;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			// This shouldn't happen so we'll convert it to a runtime exception
			throw new IllegalStateException("Cannot create instance of SecureRandom.", e);
		}

		// Set each lottery number to a random integer
		LotteryNumbers numbers = new LotteryNumbers();
		numbers.setNumber1(random.nextInt(upperLimit));
		numbers.setNumber2(random.nextInt(upperLimit));
		numbers.setNumber3(random.nextInt(upperLimit));
		numbers.setNumber4(random.nextInt(upperLimit));
		numbers.setNumber5(random.nextInt(upperLimit));
		return numbers;
	}

}
