package singleton;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ThreadSafeSingletonTest {

	@Test
	final void testGetInstance() throws InterruptedException {
		 int threadsAmount = 500;
		    Set<ThreadSafeSingleton> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

		    ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

		    for (int i = 0; i < threadsAmount; i++) {
		        executorService.execute(() -> {
		        	ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		            singletonSet.add(singleton);
		        });
		    }

		    executorService.shutdown();
		    executorService.awaitTermination(1, TimeUnit.MINUTES);

		    Assert.assertEquals(1, singletonSet.size());
	}

}
