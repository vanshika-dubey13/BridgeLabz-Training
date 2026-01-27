package com.collections.annotations.cacheresult;


class MathServiceImpl implements MathService {

	@CacheResult
	@Override
	public int slowSquare(int number) {
		try {
			Thread.sleep(1000); // simulate expensive computation
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Computing square for " + number);
		return number * number;
	}
}
