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

def getSemanticVersion() {
    String fullSemVer = sh(returnStdout: true, script: "gitversion /showvariable FullSemVer")
    return fullSemVer
}

def sayHiToMackah() {
    return "hello mackah666"
}


def getBranchName() {
    String branchName = sh(returnStdout: true, script: "gitversion /showvariable BranchName")
        .trim()
        .minus("origin/")
     return branchName
}


def getxCodeVersionForPnMVersion(String pnmVersion){
	String xCodeVersion = env[pnmVersion]
    if(!xCodeVersion) {
        println "No match found, using default"
        xCodeVersion = env["default"]
    }
    return xCodeVersion
} 


