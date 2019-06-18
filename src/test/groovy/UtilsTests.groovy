import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class UtilsTests extends BasePipelineTest {
    def utils

    @Before
    void setUp() {
        super.setUp()
        // load getCommitHash
        utils= loadScript("vars/utils.groovy")
    }

    @Test
    void testCall() {
        def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"

        // create mock sh step
        //helper.registerAllowedMethod("utils.getCommitHash", []) { return hash }

        // call getCommitHash and check result
        def result = utils.getCommitHash()
        //assertEquals "result:", hash, result
        println result
    }
}
