package test.ailab.fetch;

import org.ailab.cache.ApplicationContextFactory;
import org.ailab.fetch.FetchShengfurec;
import org.junit.Test;

public class FetchShengfurecTest {

	@Test
	public void testFetchAllBetContent() {
		FetchShengfurec fetchShengfurec = (FetchShengfurec) ApplicationContextFactory.appContext
				.getBean("fetchShengfurec");
		fetchShengfurec.fetchAllBetContent();
	}
}
