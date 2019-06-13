import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class BuildWrapperTest extends BasePipelineTest {
    def buildWrapper

    @Before
    void setUp() {
        super.setUp()
        binding.setVariable('scm', [:])
        helper.registerAllowedMethod('library', [String.class], null)
        // load toAlphanumeric
        buildWrapper = loadScript("vars/buildWrapper.groovy")
    }

    @Test
    void testBuildWrapper() {
        // call toAlphanumeric and check result

        buildWrapper.call({
            settings = "dummy.xml"
        })

        printCallStack()
       
    }

}