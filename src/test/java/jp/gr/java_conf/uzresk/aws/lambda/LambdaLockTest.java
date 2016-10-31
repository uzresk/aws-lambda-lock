package jp.gr.java_conf.uzresk.aws.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.amazonaws.ClientConfiguration;

@RunWith(JUnit4.class)
public class LambdaLockTest {

	@Test
	public void locks() {
		ClientConfiguration cc = new ClientConfiguration();
		cc.setProxyHost("tkyproxy.intra.tis.co.jp");
		cc.setProxyPort(8080);
		// System.out.println(new LambdaLock(cc).lock("vol-02c2f91365589914a",
		// 10000, new TestContext()));
	}

	@Test
	public void updateItem() {
		ClientConfiguration cc = new ClientConfiguration();
		cc.setProxyHost("tkyproxy.intra.tis.co.jp");
		cc.setProxyPort(8080);
		// new LambdaLock(cc).updateItem("foo", System.currentTimeMillis(), 10,
		// new TestContext());
	}
}
