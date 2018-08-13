package com.scarlatti

import com.scarlatti.lib2.Lib2AutoConfig
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [Lib2AutoConfig])
class Lib2AutoConfigTest extends Specification {

	@Test
	"context can load"() {
		when:
			println "loaded context."
		then:
			notThrown(Exception)
	}

}
