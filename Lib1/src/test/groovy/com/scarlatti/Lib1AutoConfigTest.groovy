package com.scarlatti

import com.scarlatti.app.Lib1AutoConfig
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [Lib1AutoConfig])
class Lib1AutoConfigTest extends Specification {

	@Test
	"context can load"() {
		when:
			println "loaded context."
		then:
			notThrown(Exception)
	}

}
