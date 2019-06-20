/**
 * getCommitHash returns the current git commit hash.
 */
classs utils 
def getCommitHash() {
	String revision = sh(returnStdout: true,
          script: 'git rev-parse HEAD')
	return revision
    //return sh(returnStdout: true, script: "git rev-parse HEAD")
    //return "hello world"
    //return sh(returnStdout: true, script: "gitversion /showvariable Sha")
}

return this
