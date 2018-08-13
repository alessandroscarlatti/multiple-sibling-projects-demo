package com.scarlatti

import com.scarlatti.app.Lib2
import com.scarlatti.app.Lib2AutoConfig
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [Lib2AutoConfig])
class Lib2AutoConfigTest extends Specification {

	@Autowired
	Lib2 lib2

	@Test
	"context can load"() {
		when:
			println "loaded context."
			lib2.run()
		then:
			notThrown(Exception)
	}

}
