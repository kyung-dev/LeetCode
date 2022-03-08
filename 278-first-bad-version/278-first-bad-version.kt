/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var firstBad = n
        var lastGood = 0
        var term = n/2
        var index = term
        
        while(true){
            if (term==0) term=1 else term/=2
            if(!isBadVersion(index)){
                if(index>lastGood) lastGood = index
                index+=term
            }
            else{
                if(index<firstBad) firstBad = index
                index-=term
                
            }
            if(lastGood+1==firstBad) return firstBad
            println("bad: $firstBad, good: $lastGood, index: $index, term: $term")


        }
        return firstBad
	}
}