
def version(){
    def currentBranchName=gitUtils.currentBranchName()
    //def currentTags=""
    //def suffixBranchName=""
    if (currentBranchName)=="master") {
        currentTags=gitUtils.currentTags()
        echo "we are in master $currentTags"
        if (currentTags?.trim()){
            return currentTags
        } else {
            //error
            return ""
        }
    } /*else if ( suffixBranchName=currentBranchName.replaceFirst(/^(?:release|hotfix)\//,"") ){
        echo "we are in release/$suffixBranchName"
        if (suffixBranchName.?.trim()){
            def countSince=(currentBranchName ~=/^release/?
                gitUtils.commitsCountSinceBranch("develop"):
                gitUtils.commitsCountSinceBranch("master"))
            return suffixBranchName+"-rc"+(countSince>0?countsince:"")
        } else {
            //error
            return ""
        }
    } else { //now

    }*/
}