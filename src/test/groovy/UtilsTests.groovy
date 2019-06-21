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
    void testgetCommitHash() {
        def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"


        // create mock sh step
        helper.registerAllowedMethod('getCommitHash', []) { f -> return hash }

        // call getCommitHash and check result
        def result = utils.getCommitHash()
        assertEquals "result:", hash, result

        //printCallStack()
        println "hello : $result"

    }

    @Test
    void testgetBranchName() {
        //def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"
        def branch = "develop"

        // create mock sh step
        helper.registerAllowedMethod('getBranchName', []) { f -> return branch }

        // call getCommitHash and check result
        def result = utils.getBranchName()
        assertEquals "result:", branch, result

        //printCallStack()
        println "hello : $result"

    }


//getBranchName
    @Test
    void testgetSemanticVersion() {
        //def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"
        def version = "1.1.0"

        // create mock sh step
        helper.registerAllowedMethod('getSemanticVersion', []) { f -> return "1.1.0" }

        // call getCommitHash and check result
        def result = utils.getSemanticVersion()
        assertEquals "result:", version, result

        //printCallStack()
        println "hello : $result"

    }

    @Test
    void testHiMackahCall() {
        //def hash = "9ee0fbdd081d0fa9e9d40dd904309be391e0fb2b"
        def hash = "hello world"

        // create mock sh step
        helper.registerAllowedMethod('sayHiToMackah', []) { f -> return "mackah666" }

        // call getCommitHash and check result
        def result = utils.sayHiToMackah()
        assertEquals "result:", "mackah666", result

        //printCallStack()
        println "hello : $result"

    }
}
