import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class UtilsTests extends BasePipelineTest {
    def utils

    @Before
    void setUp() {
        super.setUp()
        utils = loadScript("vars/utils.groovy")
    }

    @Test
    void testgetCommitHash() {
        def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"
        helper.registerAllowedMethod('getCommitHash', []) { f -> return hash }
        def result = utils.getCommitHash()
        assertEquals "result:", hash, result

    }

    @Test
    void testgetBranchName() {
        def branch = "develop"
        helper.registerAllowedMethod('getBranchName', []) { f -> return branch }
        def result = utils.getBranchName()
        assertEquals "result:", branch, result

    }

    @Test
    void testgetxCodeVersionForPnMVersion() {
        def xcode = "10.2"
        helper.registerAllowedMethod('getxCodeVersionForPnMVersion', [ String ]) { f -> return xcode }
        def result = utils.getxCodeVersionForPnMVersion("2.22.0")
        assertEquals "result:", xcode, result

    }

    @Test
    void testgetSemanticVersion() {
        def version = "1.1.1"
        helper.registerAllowedMethod('getSemanticVersion', []) { f -> return version }
        def result = utils.getSemanticVersion()
        assertEquals "result:", version, result

    }

    @Test
    void testHiMackahCall() {
        def hash = "hello world"
        helper.registerAllowedMethod('sayHiToMackah', []) { f -> return "mackah666" }
        def result = utils.sayHiToMackah()
        assertEquals "result:", "mackah666", result

    }
}
