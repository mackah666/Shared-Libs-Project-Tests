/**
 * getCommitHash returns the current git commit hash.
 */
classs utils 
def getCommitHash() {
    //return sh "git rev-parse HEAD"
    return sh(returnStdout: true, script: "git rev-parse HEAD")
}
