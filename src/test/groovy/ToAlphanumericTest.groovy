import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class ToAlphanumericTest extends BasePipelineTest {
    def toAlphanumeric

    @Before
    void setUp() {
        super.setUp()
        // load toAlphanumeric
        toAlphanumeric = loadScript("vars/toAlphanumeric.groovy")
    }

    @Test
    void testOneCall() {
        // call toAlphanumeric and check result
        def result = toAlphanumeric(text: "a_B-c.1")
        printCallStack()
        assertEquals "result:", "abc1", result
        println result
    }

    @Test
    void testTwoCall() {
        // call toAlphanumeric and check result
        def result = toAlphanumeric(text: "*&63")
        printCallStack()
        assertEquals "result:", "63", result
        println result
    }
}
